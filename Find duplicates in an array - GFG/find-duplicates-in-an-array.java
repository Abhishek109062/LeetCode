// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        ArrayList<Integer> obj=new ArrayList<>();
               int temp=0;
	           for(int x=0;x<n-1;x++){
	               if(arr[x]==arr[x+1])
	               temp++;
	               else if(temp>0){
	                   obj.add(arr[x]);        
	                   temp=0;
	               }
	           }
	           if(temp>0)
	           obj.add(arr[n-1]);
	           if(obj.isEmpty())
	           obj.add(-1);
	       return obj;         
    }
}
