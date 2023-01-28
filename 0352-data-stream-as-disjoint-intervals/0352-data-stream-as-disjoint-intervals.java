class SummaryRanges {
    /*
        variable names: just_peeche means just previous 
        just_bada means next higher
    */
    TreeMap<Integer, Integer> map;
    
    public SummaryRanges() {
        map = new TreeMap<>();        
    }
    
    public void addNum(int value) {
        Map.Entry<Integer, Integer> just_peeche = map.floorEntry(value);
        int left = value, right = value;
        if(just_peeche != null) {
            int just_peeche_ka_right = just_peeche.getValue();
            if(just_peeche_ka_right >= value){
                return;
            }
            if(just_peeche_ka_right == value - 1){
                left = just_peeche.getKey();
            }
        }
        Map.Entry<Integer, Integer> just_bada = map.higherEntry(value);
        if(just_bada != null && just_bada.getKey() == value + 1){
            right = just_bada.getValue();
            map.remove(just_bada.getKey());
        }
        map.put(left, right);
    }
    
    public int[][] getIntervals() {
        int[][] result = new int[map.size()][2];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }
        return result;
    }
}