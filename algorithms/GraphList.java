// import java.util.HashMap;
// import java.util.LinkedList;

// public class GraphList {

// public HashMap<Node, LinkedList<Node>> adjacencyMap;
// public boolean directed;

// public GraphList(boolean directed) {
// this.directed = directed;
// adjacencyMap = new HashMap<>();
// }

// public void addEdge(Node source, Node destination) {
// if (!adjacencyMap.keySet().contains(source)) {
// adjacencyMap.put(source, null);
// }
// if (!adjacencyMap.keySet().contains(destination)) {
// adjacencyMap.put(destination, null);
// }

// }

// public void printEdges() {
// for (Node node : adjacencyMap.keySet()) {
// System.out.print("The " + node.name + " has an edge towards: ");
// if (adjacencyMap.get(node) != null) {
// for (Node neighbor : adjacencyMap.get(node)) {
// System.out.print(neighbor.name + " ");
// }
// System.out.println();
// } else {
// System.out.println("none");
// }
// }
// }

// }

// // class Node {
// // int n;
// // String name;

// // Node(int n, String name) {
// // this.n = n;
// // this.name = name;
// // }
// // }
