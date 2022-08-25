class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		int[] nextIndexToStartLooking = new int[26];
        for (char curr : ransomNote.toCharArray()) {
            int index = magazine.indexOf(curr, nextIndexToStartLooking[curr - 97]);
            if (index == -1)
                return false;
            nextIndexToStartLooking[curr - 97] = ++index;
        }
        return true;   
    }
}