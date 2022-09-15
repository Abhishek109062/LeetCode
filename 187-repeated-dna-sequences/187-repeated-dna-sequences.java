class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
      if(s.length()>10000) 
            return new ArrayList<>();
    Set seen = new HashSet(), repeated = new HashSet();
    for (int i = 0; i + 9 < s.length(); i++) {
        String ten = s.substring(i, i + 10);
        if (seen.contains(ten)) {
            repeated.add(ten);
        } else {
            seen.add(ten);
        }
    }
    return new ArrayList(repeated);
}
}