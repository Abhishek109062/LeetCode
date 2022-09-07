class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int fact[] = new int[n+1];
        fact[0] = 1;
        for(int x=1;x<=n;x++)
            fact[x]=fact[x-1]*x;
        
        for(int x = 1 ;x <= n ;x++)
            numbers.add(x);
        
        k--;
        
        
        for(int x = 1 ;x <= n ;x++ ){
            int i=k/fact[n-x];
            s.append(String.valueOf(numbers.get(i)));
            numbers.remove(i);
            k-=i*fact[n-x];
        }
        
        return s.toString();
    }
}