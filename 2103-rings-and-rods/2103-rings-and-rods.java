class Solution {
    public int countPoints(String rings) {
        int[] red = new int[10];
        int[] green = new int[10];
        int[] blue = new int[10];
        
        for(int x = 0; x < rings.length(); x += 2){
            int idx = rings.charAt(x+1) - '0';
            
            char ch = rings.charAt(x);
            
            if(ch == 'R')
                red[idx]++;
            else if(ch == 'B')
                blue[idx]++;
            else
                green[idx]++;
        }
        
        int ans = 0;
        for(int x = 0; x < 10; x++){
            if(red[x] > 0 && green[x] > 0 && blue[x] > 0)
            ans++;
        }
        return ans;
    }
}