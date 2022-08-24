/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1)
        {
            return 1;
        }
        int s=0;
        while(n-s>1)
        {
            int mid=s+(n-s)/2;
            if(isBadVersion(mid))
                n=mid;
            else
                s=mid;
        }
        return n;
    }
}