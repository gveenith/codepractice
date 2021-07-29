import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class GraphListDFS {

    public static void main(String[] args) {

        GraphList graph = new GraphList(4, true);

        graph.addEdge(a, b);
        graph.addEdge(b, c);
        graph.addEdge(b, d);
        graph.addEdge(c, e);
        graph.addEdge(b, a);

        graph.printEdges();

    }

}

class GraphList {

    public HashMap<Node, LinkedList<Node>> adjacencyMap;
    public boolean directed;

    public GraphList(boolean directed) {
        this.directed = directed;
        adjacencyMap = new HashMap<>();
    }

    public void addEdgeHelper(Node a, Node b) {
        LinkedList<Node> tmp = adjacencyMap.get(a);

        if (tmp != null) {
            tmp.remove(b);
        } else
            tmp = new LinkedList<>();
        tmp.add(b);
        adjacencyMap.put(a, tmp);
    }

    public void addEdge(Node source, Node destination) {
        if (!adjacencyMap.keySet().contains(source)) {
            adjacencyMap.put(source, null);
        }
        if (!adjacencyMap.keySet().contains(destination)) {
            adjacencyMap.put(destination, null);
        }

        addEdgeHelper(source, destination);

    }

    public void printEdges() {

        System.out.println(Arrays.asList(adjacencyMap));

        for (Node node : adjacencyMap.keySet()) {
            System.out.print("The " + node.name + " has an edge towards: ");
            if (adjacencyMap.get(node) != null) {
                for (Node neighbor : adjacencyMap.get(node)) {
                    System.out.print(neighbor.name + " ");
                }
                System.out.println();
            } else {
                System.out.println("none");
            }
        }
    }

}

class Node {
    int n;
    String name;

    Node(int n, String name) {
        System.out.println(n);
        this.n = n;
        this.name = name;
    }
}
