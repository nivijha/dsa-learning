package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSorting {
    static class Edge{
        int des;
        int src;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 edge

        // 1 edge

        // 2 edge
        graph[2].add(new Edge(2, 3));

        // 3 edge
        graph[3].add(new Edge(3, 1));

        // 4 edge
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        
        // 5 edge
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topSortDFS(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topSortUtilDFS(graph, i, vis, s); //modified dfs
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtilDFS(ArrayList<Edge> graph[], int curr, boolean[] vis, Stack<Integer> s){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                topSortUtilDFS(graph, e.des, vis, s);
            }
        }

        s.push(curr);
    }

    public static void calInDeg(ArrayList<Edge> graph[], int indeg[]){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.des]++;
            }
        }
    }

    public static void topSortBFS(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calInDeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        //bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+ " "); //topological sort print

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.des]--;
                if(indeg[e.des]==0){
                    q.add(e.des);
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSortDFS(graph);

        System.out.println();

        topSortBFS(graph);
    }
}
