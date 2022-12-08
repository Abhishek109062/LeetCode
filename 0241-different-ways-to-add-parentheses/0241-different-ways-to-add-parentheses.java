class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        
        //Base case
        if(input.length()==1){
            List<Integer>temp = new ArrayList<>();
            int num = input.charAt(0)-'0';
            temp.add(num);
            return temp;
        }
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<input.length();i++){
            
            //If there is a binary operator, then partition
            if(input.charAt(i)=='+'||input.charAt(i)=='-'||input.charAt(i)=='*'){
                String p1 = input.substring(0,i);
                String p2 = input.substring(i+1);
                
                List<Integer>res1 = diffWaysToCompute(p1);
                List<Integer>res2 = diffWaysToCompute(p2);
				
				//Now compute values using both parts
                for(int t1 : res1){
                    for(int t2 : res2){
                        if(input.charAt(i)=='+'){
                            ans.add(t1+t2);
                        }else if(input.charAt(i)=='-'){
                            ans.add(t1-t2);
                        }else {
                            ans.add(t1*t2);
                        }
                    }
                }
            }
        }
        //Means there is no operator in Input string, that's why ans list is empty
        if(ans.size()==0)ans.add(Integer.valueOf(input));
        return ans;
        
    }
}