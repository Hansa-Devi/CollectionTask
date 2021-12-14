import java.util.LinkedList;

public class LinkedList_13_RemoveFirstandLastElement {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        l.removeFirst();
        l.removeLast();
        System.out.println("After removing first and last: "+l);
    }
}
