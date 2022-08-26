class Solution {
    public boolean reorderedPowerOf2(int n) {
        char ch[]=String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        int pow=1;
        for(int x=0;x<32;x++){
            if(x==0)
                pow=1;
            else
                pow*=2;
            char temp[]=String.valueOf(pow).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(ch,temp))
                return true;
        }
        return false;
    }
}