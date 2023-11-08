class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        
        int dis = Math.max(Math.abs(fy-sy), Math.abs(fx-sx));
        
        
        if(sx == fx && sy == fy && t == 1){
            return false;
        
        }
            
        if(t >= dis)
            return true;
        
        return false;
    }
}