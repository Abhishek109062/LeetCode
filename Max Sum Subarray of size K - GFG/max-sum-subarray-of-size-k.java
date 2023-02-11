//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int N){
        long sum = 0;
        long maxt = 0;
        int j = 0;
        
        for(int x = 0; x < N; x++){
            sum += arr.get(x);
            k--;
            
            if(k == 0){
                maxt = Math.max(maxt, sum);
                sum -= arr.get(j++);
                k++;
            }
            
            
        }
        
        
        
        return maxt;
    }
}