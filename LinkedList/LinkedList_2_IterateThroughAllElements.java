import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_2_IterateThroughAllElements {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        for (Integer integer : l)
            System.out.println(integer);

    }
}
