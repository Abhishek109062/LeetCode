// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] inter)
    {
        // Code here 
        ArrayList<Pair> arr =new ArrayList<>();
        for(int i=0;i<inter.length;i++){
            arr.add(new Pair(inter[i][0],inter[i][1]));
        }
        Collections.sort(arr, new MyComparator());
        
        ArrayList<Pair> ans = new ArrayList<>();
            ans.add(arr.get(0));
            for(int i=1;i<inter.length;i++){
            Pair t = arr.get(i);
            Pair pre = ans.get(ans.size()-1);
             if(pre.end >=t.start){
                ans.remove(ans.size()-1);
                ans.add(new Pair(pre.start,Math.max(pre.end,t.end)));
             }else{
                 ans.add(t);
             }
         }
       
        int fans[][] =  new int[ans.size()][2];
        for(int i=0;i<fans.length;i++){
            fans[i][0] = ans.get(i).start;
            fans[i][1] = ans.get(i).end;
        }
        return fans;
    }
}
class MyComparator implements Comparator<Pair>{
    public int compare(Pair o1,Pair o2){
        return o1.start-o2.start;
    }
}
class Pair{
    int start,end;
    Pair(int x,int y){
        this.start=x;
        this.end = y;
    }
}