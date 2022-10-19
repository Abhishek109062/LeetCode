class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> count = new HashMap<>();
		List<String> ans = new ArrayList<>();
		
        Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b) ->{
            if(a.getValue() == b.getValue())
                return a.getKey().compareTo(b.getKey());
            return b.getValue() - a.getValue();
        });
        
        for(String w : words)
            count.merge(w, 1, Integer::sum);
        
        for(Map.Entry<String, Integer> e : count.entrySet())
            queue.add(e);
        
        while(k-- > 0)
            ans.add(queue.remove().getKey());
        
        return ans;
    }
}