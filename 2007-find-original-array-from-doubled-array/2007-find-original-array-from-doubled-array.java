class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 == 1)
            return new int[0];
        Map<Integer,Integer> ans = new TreeMap<>();
        for(int a:changed)
            ans.put(a,ans.getOrDefault(a,0)+1);
        
        int ar[] = new int[changed.length/2];
        int index = 0;
        for(int a : ans.keySet()){
            if(ans.get(a) > ans.getOrDefault(a*2,0))
            {
                //System.out.println("hello");
                return new int[0];
            }
            
            for(int x=1; x <= ans.get(a);x++){
                ar[index++] = a;
            ans.put(a*2,ans.get(a*2)-1);
            }
        }
        return ar;
    }
}