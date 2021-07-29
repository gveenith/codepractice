package algorithms;

import java.util.LinkedList;

public class GraphLL {

    private int node;
    private LinkedList<LinkedList<Integer>> graph;
    private boolean[] visited;

    GraphLL(int node) {
        this.node = node;
        graph = new LinkedList<>();
        for (int i = 0; i < node; i++) {
            graph.add(new LinkedList<Integer>());
        }
    }

    void addEdges(Integer source, Integer destination) {
        graph.get(source).add(destination);
    }

    void print() {
        graph.stream().forEach(System.out::print);
    }

    void graphDFS(int startNode){
        visited = new boolean();
        DFSRecursion(startNode);
    }

    void DFSRecursion(int node){
        visited[node] = true;
        LinkedList<Integer> dest = graph.get(node)
        dest.forEach(action);
        if(!visited[]){

        }

    }

    public static void main(String[] args) {
        GraphLL graphLL = new GraphLL(3);
        graphLL.addEdges(0, 1);
        graphLL.addEdges(0, 2);
        graphLL.addEdges(1, 2);
        graphLL.print();
    }
}
