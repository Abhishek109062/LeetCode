class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> temp = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(!temp.add(ch))
                return ch;
        }
        return 'a';
    }
}