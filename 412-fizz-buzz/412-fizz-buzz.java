class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        for(int x=1;x<=n;x++){
            if(x%15==0){
                ans.add("FizzBuzz");
            }
            else if(x%3==0)
                ans.add("Fizz");
            else if(x%5==0)
                ans.add("Buzz");
            else
                ans.add(""+x);
        }
        return ans;
    }
}