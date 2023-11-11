class Graph {

    private final List<Edge>[] adj;
    private final int V;

    public Graph(int n, int[][] edges) {
        this.V = n;
        this.adj = (List<Edge>[]) new List[n];

        for (var v = 0; v < V; v++) {
            adj[v] = new ArrayList<>();
        }

        for (var edge : edges) {
            addEdge(edge);
        }
    }

    public void addEdge(int[] edge) {
        var e = new Edge(edge[0], edge[1], edge[2]);
        adj[e.from()].add(e);
    }

    public int shortestPath(int node1, int node2) {
        return new Dijkstra(this, node1, node2).minDist;
    }

    record Edge(int from, int to, int weight) {}

    static class Dijkstra {

        private final int[] distTo;
        private final Queue<NodeDist> pq;
        private int minDist = -1;

        Dijkstra(Graph G, int src, int dst) {
            this.distTo = new int[G.V];
            this.pq = new PriorityQueue<>();

            // init distTo arr with INF
            for (var v = 0; v < G.V; v++) {
                distTo[v] = Integer.MAX_VALUE;
            }

            distTo[src] = 0;
            pq.offer(new NodeDist(src, 0));

            while (!pq.isEmpty()) {
                var minNodeDist = pq.poll();

                // check if already a better cost
                if (minNodeDist.dist() > distTo[minNodeDist.v()]) continue;

                // check if destination reached
                if (minNodeDist.v() == dst) {
                    minDist = minNodeDist.dist();
                    return;
                }

                // relax adjacent nodes to minNode
                for (var w : G.adj[minNodeDist.v()]) {
                    relax(w);
                }
            }
        }

        private void relax(Edge e) {
            int v = e.from(), w = e.to();
            if (distTo[w] > distTo[v] + e.weight()) {
                distTo[w] = distTo[v] + e.weight();
                pq.add(new NodeDist(w, distTo[w]));
            }
        }

        record NodeDist(int v, int dist) implements Comparable<NodeDist> {
            
            @Override
            public int compareTo(NodeDist o) {
                return dist - o.dist;
            }
        }
    }
}