public class AppDriver {

    private static int vertices = 8;

    public static void main(String[] args) {
        // Testing the matrix representation
        AdjMatrixDirected matrixGraph = new AdjMatrixDirected(vertices);
        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 2);
        matrixGraph.addEdge(0, 3);
        matrixGraph.addEdge(1, 5);
        matrixGraph.addEdge(2, 5);

        System.out.println("Matrix Representation:\n");
        matrixGraph.printGraph();

        System.out.println("\n");

        // Testing the list representation
        System.out.println("List Representation:\n");
        AdjListDirected listGraph = new AdjListDirected(vertices);
        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 2);
        listGraph.addEdge(0, 3);
        listGraph.addEdge(1, 5);
        listGraph.addEdge(2, 5);

        listGraph.printGraph();


    }
}
