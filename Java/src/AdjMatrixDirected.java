public class AdjMatrixDirected {
    private int vertices;
    private int[][] matrix;

    public AdjMatrixDirected(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;
    }

    public void printGraph(){
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
