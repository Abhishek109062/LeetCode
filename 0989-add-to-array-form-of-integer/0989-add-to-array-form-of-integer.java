class Solution {
    public List<Integer> addToArrayForm(int[] ar, int k) {
        List<Integer> temp = new ArrayList<>();
        int carry = 0;
        int i = ar.length - 1;
        while(k != 0 || i >= 0){
            int temp2 = k % 10 + carry;
            k = k/10;
            
            if(i >= 0){
                temp2 += ar[i--];
            }
            
            carry = temp2 / 10;
            temp.add(0, temp2%10);
        }
        
        if(carry > 0)
            temp.add(0, carry);
        
        return temp;
    }
}