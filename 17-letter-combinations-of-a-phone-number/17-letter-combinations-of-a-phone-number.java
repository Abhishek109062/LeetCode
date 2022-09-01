class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        String[] phn={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        comb(digits,0,digits.length(),"",phn);
        return ans;
    }
    public void comb(String digits,int index,int len,String temp,String[] phn){
        if(len==index){
            ans.add(temp);
            return;
        }
        int cur=(int)(digits.charAt(index)-'0');
        for(int x=0;x<phn[cur].length();x++){
            comb(digits,index+1,len,temp+phn[cur].charAt(x),phn);
        }
    }
}