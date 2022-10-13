class Solution {
//     public int numTilePossibilities(String tiles) {
//         Set<String> ans = new HashSet<>();
//         boolean[] visit = new boolean[tiles.length()];
//         diff(tiles, "", ans, visit);
//         return ans.size()-1;
//     }
//     public void diff(String s, String temp,Set<String> ans, boolean[] visit){
//         ans.add(temp);
        
//         for(int x = 0; x < s.length(); x++){
//             if(!visit[x]){
//                 visit[x] = true;
//                 diff(s, temp+s.charAt(x), ans, visit);
//                 visit[x] = false;
//             }
//         }
//     }
    
    //Second Method using freq array
    public int numTilePossibilities(String tiles) {
        int freq[] = new int[26];
        // List<String> ans = new ArrayList<>();
        for(int x = 0; x < tiles.length(); x++)
            freq[tiles.charAt(x) - 'A']++;
        
        return tilePossible(freq);
    }
    
    public static int tilePossible(int[] freq){
        int count = 0;
        for(int x = 0; x < freq.length; x++){
            if(freq[x] >= 1){
                // char ch = (char)(x + 'A');
                freq[x]--;
                count += tilePossible(freq) + 1;
                freq[x]++;
            } 
        }
        return count;
    }
    
}
