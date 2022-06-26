// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(arr==null || arr.length==0)
        return ans;
        
        Arrays.sort(arr);
        int len=arr.length;
        
        for(int x=0;x<len;x++){
         int sum=k-arr[x];
         for(int y=x+1;y<len;y++){
             int sum2=sum-arr[y];
             int left=y+1;
             int right=len-1;
             while(left<right){
                 int sum3=arr[right]+arr[left];
                 if(sum3<sum2)
                 left++;
                 else if(sum3>sum2)
                 right--;
                 else{
                     ArrayList<Integer> temp=new ArrayList<>();
                     temp.add(arr[x]);
                     temp.add(arr[y]);
                     temp.add(arr[left]);
                     temp.add(arr[right]);
                     ans.add(temp);
                     while(left<right && temp.get(2)==arr[left])
                     ++left;
                     while(left<right && temp.get(3)==arr[right])
                     --right;
                     
                 }
                 
             }
             while(y+1<len && arr[y+1]==arr[y])
             ++y;
            
         }
         while(x+1<len && arr[x+1]==arr[x])
         ++x;
        }
        return ans;
    }
}