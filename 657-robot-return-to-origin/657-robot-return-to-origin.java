class Solution {
    public boolean judgeCircle(String moves) {
        List<Character> temp=new ArrayList<>();
        for(int x=0;x<moves.length();x++){
            char ch=moves.charAt(x);
            if(ch=='R'){
                if(temp.contains('L'))
                    temp.remove(Character.valueOf('L'));
                else
                    temp.add('R');
            }
            else if(ch=='L')
            {
                    if(temp.contains('R'))
                    temp.remove(Character.valueOf('R'));
                else
                    temp.add('L');
                
            }
            else if(ch=='U'){
                    if(temp.contains('D'))
                    temp.remove(Character.valueOf('D'));
                else
                    temp.add('U');
                
            }
            else if(ch=='D'){
                    if(temp.contains('U'))
                    temp.remove(Character.valueOf('U'));
                else
                    temp.add('D');
                
            }
            }
        return temp.isEmpty();
        
    }
}