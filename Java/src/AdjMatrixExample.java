public class AdjMatrixExample {

    int vertices;
    int matrix[][];

    AdjMatrixExample(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    void addEdge(int source, int destination){
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    void printGraph(){
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        AdjMatrixExample graph = new AdjMatrixExample(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 5);
        graph.addEdge(2, 5);
        graph.printGraph();
    }
}
