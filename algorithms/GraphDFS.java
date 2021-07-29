package algorithms;

public class GraphDFS {
    // 1. Graphs can be of 4 types
    // a. unweighted undirected graph
    // b. unweighted directed graph
    // c. weighted undirected graph
    // d. weighted directed graph
    // 2. Graps can be represented using - Lists & Matrix

    // Lets represent Graphs using Matrix first
    // And inorder to represent it this way we need to find out the
    // no of nodes, directed ? , weighted ?

    private int numOfNodes;
    private boolean directed;
    private boolean weighted;

    private float[][] matrix;

    public GraphDFS(int numOfNodes, boolean directed, boolean weighted) {
        this.numOfNodes = numOfNodes;
        this.directed = directed;
        this.weighted = weighted;

        matrix = new float[numOfNodes][numOfNodes];
    }

    public void addEdge(int source, int destination) {
        int value = 1;
        matrix[source][destination] = value;
        // since undirected graphs are summetrical we can assume this
        if (!directed) {
            matrix[destination][source] = value;
        }
    }

    public void addEdge(int source, int destination, int weight) {
        int value = weight;
        matrix[source][destination] = value;
        // since undirected graphs are summetrical we can assume this
        if (!directed) {
            matrix[destination][source] = value;
        }
    }

    public void printMatrix() {
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                System.out.format("%8s", String.valueOf(matrix[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //undirected, unweighted
        // GraphDFS graph = new GraphDFS(5, false, false);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 2);
        // graph.addEdge(0, 4);
        // graph.addEdge(2, 3);

        //directed, unweighted
        // GraphDFS graph = new GraphDFS(5, true, false);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 2);
        // graph.addEdge(0, 3);
        // graph.addEdge(0, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(4, 0);
        // graph.addEdge(4, 4);

        //undirected weighted
        // GraphDFS graph = new GraphDFS(5, false, true);
        // graph.addEdge(0, 1,2);
        // graph.addEdge(0, 2,10);
        // graph.addEdge(0, 4,4);
        // graph.addEdge(2, 3,-5);
    
        //directed weighted
        GraphDFS graph = new GraphDFS(5, true, true);
        graph.addEdge(0, 1,2);
        graph.addEdge(0, 2,10);
        graph.addEdge(0, 4,5);
        graph.addEdge(2, 3,-5);
        graph.addEdge(3, 4,2);
        graph.addEdge(4, 0,4);
        graph.addEdge(4, 4,6);

        graph.printMatrix();
    }

}
