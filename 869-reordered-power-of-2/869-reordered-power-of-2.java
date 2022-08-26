class Solution {
    public boolean reorderedPowerOf2(int n) {
        char ch[]=String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        for(int x=0;x<32;x++){
            char temp[]=String.valueOf((int)Math.pow(2,x)).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(ch,temp))
                return true;
        }
        return false;
    }
}