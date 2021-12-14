import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_4_IterateFromLastElement {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        //method 1 by using listIterator , method listIterator:
        System.out.println("using listIterator , method listIterator:");
        ListIterator<Integer> listIterator = l.listIterator(l.size());
        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous()+" ");

        //method 2 by using Iterator,method descendingIterator :
        System.out.println();
        System.out.println("by using Iterator,method descendingIterator :");
        Iterator<Integer> iterator =  l.descendingIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");

    }
}
