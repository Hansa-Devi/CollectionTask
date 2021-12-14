import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_3_IteratorFromSpecificIndex {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        ListIterator<Integer> listIterator = l.listIterator(2);
        System.out.print("Iterate from index 2: ");
        while (listIterator.hasNext())
            System.out.print(listIterator.next()+" ");
    }
}
