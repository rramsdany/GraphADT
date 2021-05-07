import java.util.*;


public class GraphExample {
    public static void main(String[] args) {
        List<Integer> l[] = new LinkedList[10];
        for(int i = 0; i < l.length; i++){
            l[i] = new LinkedList<>();
        }

        l[0].add(10); l[0].add(12); l[0].add(13);
        l[1].add(20); l[1].add(9);
        l[5].add(36); l[5].add(10);
        l[9].add(108);

        for(int i = 0; i < l.length; i++){
            System.out.println(i + " ==> " + l[i]);
        }





    }
}
