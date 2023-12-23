class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        
        int i = 0;
        List<String> temp = new ArrayList<>();
        temp.add("0b0");
        while(i < path.length()){
            // System.out.println(x+""+y);
            switch(path.charAt(i++)){
                case 'N':
                    y++;
                    String form = x+"b"+y;
                    if(temp.contains(form))
                        return true;
                    
                    temp.add(form);
                    break;
                case 'E':
                    x++;  String form1 = x+"b"+y;
                    if(temp.contains(form1))
                        return true;
                    
                    temp.add(form1);
                    break;
                case 'W':
                    x--;  String form2 = x+"b"+y;
                    if(temp.contains(form2))
                        return true;
                    
                    temp.add(form2);
                    break;
                case 'S':
                    y--;  String form3 = x+"b"+y;
                    if(temp.contains(form3))
                        return true;
                    temp.add(form3);
                    break;
                default:
                    break;
            }
             // System.out.println(temp.get(temp.size() - 1));
        }
        
        return false;
    }
}