class Data{
    public int[] point;
    public int index;
    public Data(int[] point, int index){
        this.point = point;
        this.index = index;
    }
}
class Solution {
    HashMap<Integer, List<Data>> adjListX = new HashMap<Integer, List<Data>>();
    HashMap<Integer, List<Data>> adjListY = new HashMap<Integer, List<Data>>();
    boolean[] visited ;
    private void constructAdjList(int[][] stones){
        for(int i = 0 ; i < stones.length;++i){
                Data copy = new Data(stones[i],i);
                adjListX.computeIfAbsent(stones[i][0],k -> new ArrayList<Data>()).add(copy);
                adjListY.computeIfAbsent(stones[i][1],k -> new ArrayList<Data>()).add(copy);
        }
    }

    public int dfs(int[] point,int hop){

        for(Data data : adjListX.get(point[0])){
            if(!visited[data.index]){
                visited[data.index] = true;
                hop = dfs(data.point,hop+1);
            }
        }
        for(Data data : adjListY.get(point[1])){
            if(!visited[data.index]){
                visited[data.index] = true;
                hop = dfs(data.point,hop+1);
            }
        }
        return hop;
    }

    public int removeStones(int[][] stones) {
        constructAdjList(stones);
        int max = 0;
        visited = new boolean[stones.length];
        for(int i = 0 ; i < stones.length;++i){
            if(!visited[i]) {
                visited[i] = true;
                max += dfs(stones[i],0);
            }
        }
        return max;
    }
}