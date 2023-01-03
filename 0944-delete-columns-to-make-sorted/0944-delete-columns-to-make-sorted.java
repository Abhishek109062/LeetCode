class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        
        for(int y = 0;y < strs[0].length(); y++){
            for(int x = 0; x < strs.length - 1; x++){
                if(strs[x].charAt(y) > strs[x+1].charAt(y)){
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }
}