class Solution {
    public String[] findWords(String[] words) {
        int m1 = getMask("qwertyuiop");
        int m2 = getMask("asdfghjkl");
        int m3 = getMask("zxcvbnm");
        List<String> array = new ArrayList<>();
        for(String word: words){
            int t = getMask(word);
            if((t&m1) == t || (t&m2) == t || (t&m3)==t)
                array.add(word);
        }
        String[] res = new String[array.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = array.get(i);
        }
        return res;
    }
    
    public int getMask(String str){
        int m = 0;
        for(char c: str.toCharArray()){
            m = m | (1 << (c - 97));
        }
        return m;
    }
}