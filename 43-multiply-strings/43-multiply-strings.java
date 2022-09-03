class Solution {
    public String multiply(String num1, String num2) {
        if(num1.length() == 1 && num1.charAt(0) == '0')
            return num1;
        if(num2.length() == 1 && num2.charAt(0) == '0')
            return num2;
        
        int[] res = new int[num1.length()+num2.length()];
        for(int k1=0; k1<num1.length(); k1++){
            int i = num1.length()-1-k1;
            int d1 = num1.charAt(i)-'0';
            if(d1 == 0) continue;
            for(int k2=0; k2<num2.length(); k2++){
                int j = num2.length()-1-k2;
                int d2 = num2.charAt(j)-'0';
                if(d2 == 0) continue;
                int tmp = d1 * d2;
                res[k1+k2] += tmp;   // 位数小的在前面
            }
        }
        for(int i=0; i<res.length; i++){    // 把每个位的和规整一下
            if(res[i] >= 10) {
                res[i+1] += res[i] / 10;    // assert res[i+1]下标一定有效
                res[i] = res[i] % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=res.length-1; i>=0; i--){
            if(res[i] == 0 && i == res.length-1) {  // ignore first 0
                continue;
            }
            char c = (char)(res[i]+'0');
            sb.append(c);
        }
        return sb.toString();
    }
}