package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
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
        // graph[3].add(new Edge(3, 5, 1));

        // 4 edge
        graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 5, 1));
    }

    // Time Complexity -- O(V+E)
    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
    }


    // Time Complexity -- O(V+E)
    public static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //source = 0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                } 
            }
        }
    }

    public static boolean isBapartite(ArrayList<Edge>[] graph){
        int color[] = new int[graph.length];
        for(int i=0; i<color.length; i++){
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(color[i] == -1){ //BFS
                q.add(i);
                color[i] = 0; //Yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j); // e.dest
                        if(color[e.des] == -1){
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.des] = nextColor;
                            q.add(e.des);
                        } else if(color[e.des] == color[curr]){
                            return false;
                        }
                    }                    
                }
            }
        }

        return true;
    }

    

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBapartite(graph));
    }
}
