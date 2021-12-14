import java.util.LinkedList;

public class LinkedList_7_InsertAtFront {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        l.offerFirst(0);
        System.out.println("After Insert at front of LinkedList:" +l);
    }
}
