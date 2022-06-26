// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long product=1L;
	    int index=-1;
        for(int x=0;x<n;x++){
            if(nums[x]!=0)
           product*=nums[x];
           else if(index!=-1)
           {
              index=-2;
               break;
               
           }
           else
           index=x;
            
	     
        }
        long[] ans=new long[n];
	       for(int x=0;x<n;x++){
	        if(index==-2)
	        ans[x]=0;
	        else if(index==-1)
	        ans[x]=product/nums[x];
	        else if(index==x)
	        ans[x]=product;
	        else 
	        ans[x]=0;
	    }
	    return ans;
	}
	    
} 
