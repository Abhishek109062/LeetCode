// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);
        int ans=-1;
        int count=1;
        for(int x=0;x<size-1;x++){
            if(a[x]==a[x+1])
            count++;
            else{
                if(count>size/2)
                ans=a[x];
                count=1;
            }
        }
        if(count>size/2)
        ans=a[size-1];
        return ans;
        
    }
}