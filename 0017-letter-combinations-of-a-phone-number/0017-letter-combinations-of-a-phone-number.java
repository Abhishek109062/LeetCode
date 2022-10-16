class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if(digits.length() == 0) return ans;
        String[] mappings = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        genPossibilities(digits, mappings, ans, 0, sb);  
        return ans;
    }
    
    public void genPossibilities(String digits, String[] mappings, List<String> ans,
                           int idx, StringBuilder stringInProgress) {
        if(idx == digits.length()) {
            ans.add(stringInProgress.toString());
            return;
        }
        char ch = digits.charAt(idx);
        String letters = mappings[ch - '0'];
        for(char letter : letters.toCharArray()) {
            stringInProgress.append(letter);
            genPossibilities(digits, mappings, ans, idx + 1, stringInProgress);
            stringInProgress.deleteCharAt(stringInProgress.length() - 1);
        }
    }
}