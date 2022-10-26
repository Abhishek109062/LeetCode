class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        char ch[] = s.toCharArray();
        int low = 0, high = removable.length;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            
            for(int x = 0; x < mid; x++)
                ch[removable[x]] = '.';
            
            if(isSafe(ch, p))
                low = mid + 1;
            else{
                high = mid - 1;
                for(int x = 0; x < mid; x++)
                    ch[removable[x]] = s.charAt(removable[x]);
            }
        }
        
        return high;
    }
    
    public boolean isSafe(char[] ch, String p){
        int i1 = 0, i2 = 0;
        while(i1 < ch.length && i2 < p.length()){
            if(ch[i1] == p.charAt(i2))
                i2++;
            
            i1++;
        }
        
        if(i2 == p.length())
            return true;
        
        return false;
    }
}