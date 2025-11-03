package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
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
        graph[0].add(new Edge(0, 2, 1));

        // 1 edge
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2 edge
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 edge
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4 edge
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // 5 edge
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 edge
        graph[6].add(new Edge(6, 5, 1));
    }

    // Time Complexity -- O(V+E)
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        // Visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                dfs(graph, e.des, vis);
            }
        }
        
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph []= new ArrayList[V];
        createGraph(graph);
        dfs(graph, 0, new boolean[V]);
    }
}
