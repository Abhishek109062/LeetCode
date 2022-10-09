class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int len = typed.length();
        int i = 0;
        for(int x = 0; x < len; x++){
            if(i<name.length() && name.charAt(i) == typed.charAt(x))
                i++;
            else if(x == 0 || typed.charAt(x) != typed.charAt(x-1))
                return false;
        }
        
        return i == name.length();
    }
}