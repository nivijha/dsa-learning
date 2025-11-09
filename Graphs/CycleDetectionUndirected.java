package Graphs;

import java.util.ArrayList;

public class CycleDetectionUndirected {
    static class Edge {
        int des; 
        int src;
        int wt;

        public Edge(int s, int d, int w){
            this.des = d;
            this.src = s;
            this.wt = w;
        }
        
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

         // 0 edge
        graph[0].add(new Edge(0, 1, 1));
        // graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));

        // 1 edge
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        // 2 edge
        // graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        // 3 edge
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        // 4 edge
        graph[4].add(new Edge(4, 3, 1));
    }


    // Time Complexity -- O(V+E)
    public static boolean dectectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[5];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                    //cycle exists in one of the parts of graph
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int parent){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case 3 ---- vis[neigh] -- false
            if (!vis[e.des]){
                if(detectCycleUtil(graph, vis, e.des, curr)) {
                    return true;
                }
            }

            //case 1 ---- vis[neigh] -- true && neigh != parent
            else if(vis[e.des] && e.des != parent){
                return true;
            }

            //case 2 ---- do nothing -- continue
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(dectectCycle(graph));

    }
}
