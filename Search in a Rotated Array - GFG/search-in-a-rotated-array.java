// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        if(key==A[0])
        return 0;
        if(key<A[0]){
            for(int x=h;x>=0;x--){
                if(key==A[x])
                return x;
                if(A[x]<A[x-1])
                break;
                
            }
        }
        else{
            for(int x=0;x<h;x++){
                if(key==A[x])
                return x;
                if(A[x]>A[x+1])
                break;
                
            }
        }
        return -1;
    }
}