import java.util.LinkedList;
import java.util.List;

public class AdjListDirected {
    private int vertices;
    private LinkedList<Integer>[] arr;

    public AdjListDirected(int vertices){
        this.vertices = vertices;
        arr = new LinkedList[vertices];

        for(int i = 0; i < arr.length; i++){
            arr[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){
        arr[source].add(destination);
    }

    public void removeEdge(int source, int destination){
        arr[source].remove(destination);
    }

    public void printGraph(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " ==> " + arr[i]);
        }
    }
}
