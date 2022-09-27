class Solution {
    public String pushDominoes(String dominoes) {
        int len = dominoes.length();
        int right[] = new int[len];
        int left[] = new int[len];
        char ch[] = dominoes.toCharArray();
        
        int count = len + 1;
        for(int x = 0; x < len; x++){
            if(ch[x] == 'R'){
                right[x] = 0;
                count = x;
            }
            else if(ch[x] == 'L'){
                count = len+1;
                right[x] = count;
            }
            else if(count == len+1)
                right[x] = count;
            else
                right[x] = x-count;
        }
        
        count = len+1;
        for(int x = len-1; x >= 0; x--){
            if(ch[x] == 'L'){
                left[x] = 0;
                count = x;
            }
            else if(ch[x] == 'R'){
                count = len+1;
                left[x] = count;
            }
            else if(count == len+1)
                left[x] = count;
            else
                left[x] = count - x;
        }
        
        char res[] = new char[len];
        for(int x = 0; x < len; x++){
            if(right[x] == left[x])
                res[x] = '.';
            else
                res[x] = right[x] < left[x] ? 'R':'L';
        }
        
        return String.copyValueOf(res);
    }
}