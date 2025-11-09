package Graphs;

import java.util.ArrayList;

public class CycleDetectionDirected {
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

        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 4, 1));

    }


    // Time Complexity -- O(V+E)
    public static boolean dectectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, i, vis, stack)){
                    return true;
                    //cycle exists in one of the parts of graph
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.des]){
                return true;
            }

            if (!vis[e.des]){
                if(detectCycleUtil(graph, e.des, vis, stack)) {
                    return true;
                }
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(dectectCycle(graph));

    }
}
