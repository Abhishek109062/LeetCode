class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        breakstring(ans,new ArrayList<>(), s);
        return ans;
    }
    
    public void breakstring(List<List<String>> ans, List<String> temp, String s){
        if(s.length() == 0){
            // System.out.println(temp);
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int x = 1; x <= s.length(); x++){
            String ss = s.substring(0,x);
            if(palin(ss)){
            temp.add(s.substring(0,x));
            // System.out.println(temp);
            breakstring(ans, temp, s.substring(x));
            temp.remove(temp.size()-1);
            }
        }
    } 
    
    public boolean palin(String s){
        int len = s.length()-1;
        for(int x = 0; x < s.length()/2; x++){
            if(s.charAt(x) != s.charAt(len-x))
                return false;
        }
        return true;
    }
}