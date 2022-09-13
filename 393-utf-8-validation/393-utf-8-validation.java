class Solution {
    public boolean validUtf8(int[] data) {
        int utfbytes = 0;
        for(int x : data){
            String binary = Integer.toBinaryString(x);
            
            binary = binary.length() >= 8 ? binary.substring(binary.length() - 8) : "00000000".substring(binary.length()%8)+binary;
            if(utfbytes == 0){
                for(int y = 0; y < binary.length(); y++){
                    if(binary.charAt(y) == '0')
                        break;
                    
                    utfbytes++;
                }
                //System.out.println(utfbytes);
                
                if(utfbytes == 0)
                    continue;
                
                if(utfbytes > 4 || utfbytes == 1)
                    return false;
            }
            else{
                if( binary.charAt(0) != '1' || binary.charAt(1) != '0')
                    return false;
                }
                
                utfbytes--;
         }
        //System.out.println("hello");
           return utfbytes == 0;
        
    }
}