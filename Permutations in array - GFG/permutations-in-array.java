// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];

            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.isPossible(a, b, n, k) ? 1 : 0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean isPossible(long a[], long b[], long n, long k) {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int x=0;x<n;x++){
            if(!(a[x]+b[(int)n-1-x]>=k))
            return false;
        }
        return true;
    }
}