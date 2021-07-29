import java.util.LinkedList;
import java.util.ListIterator;

public class GraphL {
    static class GraphLinkedList {

        private int node;
        private LinkedList<Integer>[] graph;
        boolean[] visited;

        GraphLinkedList(int node) {
            this.node = node;
            graph = new LinkedList[node];
            for (int i = 0; i < node; i++) {
                graph[i] = new LinkedList<>();
            }
        }

        void addEdge(int source, int destination) {
            graph[source].add(destination);
        }

        void print() {
            for (int j = 0; j < node; j++) {
                System.out.format("%8s", String.valueOf(graph[j]));
            }
            System.out.println(" ");
        }

        void graphDFS(int startNode) {
            visited = new boolean[node];
            recursionDFS(startNode);
        }

        void disconnectedGraphDFS(Integer startNode) {
            visited = new boolean[node];
            recursionDFS(startNode);

            for (int i = 0; i < graph.length; i++) {

                if (!visited[i]) {
                    recursionDFS(i);
                }
            }
            // ListIterator<Integer> graphNode = graph.ListIterator();
            // while (graphNode.hasNext()) {
            // Integer dest = graphNode.next();
            // if (!visited[dest]) {
            // recursionDFS(dest);
            // }
            // }

        }

        void recursionDFS(Integer startNode) {

            visited[startNode] = true;
            System.out.println(startNode + "is visited");
            for (int i = 0; i < graph[startNode].size(); i++) {
                Integer dest = graph[startNode].get(i);
                if (!visited[dest]) {
                    recursionDFS(dest);
                }
            }

        }
    }

    public static void main(String[] args) {
        GraphLinkedList graph = new GraphLinkedList(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 4);
        graph.addEdge(5, 3);
        graph.addEdge(4, 0);

        graph.print();

        // graph.graphDFS(0);
        graph.disconnectedGraphDFS(0);
    }

}