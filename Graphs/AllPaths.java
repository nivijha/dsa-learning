package Graphs;

import java.util.ArrayList;

public class AllPaths {
    static class Edge {
        int des; 
        int src;

        public Edge(int s, int d){
            this.des = d;
            this.src = s;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 edge
        graph[0].add(new Edge(0, 3));
        // 1 edge

        // 2 edge
        graph[2].add(new Edge(2, 3));

        // 3 edge
        graph[3].add(new Edge(3, 1));

        // 4 edge
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        
        // 5 edge
        graph[5].add(new Edge(5, 0)) ;
        graph[5].add(new Edge(5, 2));
    }

    // Time Complexity -- O(V+E)
    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path){ 
        // Visit
        if(src == dest){
            System.out.println(path+dest);
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllPath(graph, e.des, dest, path+src);
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph []= new ArrayList[V];
        createGraph(graph);
        printAllPath(graph, 5, 1, "");
    }
}
