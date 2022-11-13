//{ Driver Code Starts
//Initial Template for Java

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
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int k)
    {
        int[] count = new int[26];
        // char ch = '';
        int ans = 0;
        int y = 0;
        int maxcount = 0;
        // int start = 0;
        for(int x = 0; x < s.length(); x++){
            maxcount = Math.max(maxcount, ++count[s.charAt(x) - 'A']);
            
            while(x - y + 1 - maxcount > k){
                count[s.charAt(y) - 'A']--;
                y++;
            }
            
            ans = Math.max(x - y + 1, ans);
        }
        
        return ans;
    }
}