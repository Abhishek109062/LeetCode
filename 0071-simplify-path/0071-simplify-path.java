class Solution {
    public String simplifyPath(String path) {
        // String ans = "";
        Stack<String> temp = new Stack<>();
        StringBuilder ans = new StringBuilder();
        String[] ar = path.split("/");
        
        for(int x = 0; x < ar.length; x++){
            if(!temp.isEmpty() && ar[x].equals(".."))
                temp.pop();
            else if(!ar[x].equals("") && !ar[x].equals(".") && !ar[x].equals(".."))
                temp.push(ar[x]);
        }
        
        if(temp.isEmpty())
            return "/";
        
        while(!temp.isEmpty())
            ans.insert(0, temp.pop()).insert(0, "/");
        
        return ans.toString();
    }
}