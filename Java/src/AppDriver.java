public class AppDriver {

    private static int vertices = 7;

    public static void main(String[] args) {
        // Testing the matrix representation
        AdjMatrixDirected matrixGraph = new AdjMatrixDirected(vertices);
        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 2);
        matrixGraph.addEdge(0, 3);
        matrixGraph.addEdge(1, 5);
        matrixGraph.addEdge(2, 5);

        matrixGraph.printGraph();


    }
}
