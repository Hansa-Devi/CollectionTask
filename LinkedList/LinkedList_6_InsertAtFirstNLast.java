import java.util.LinkedList;

public class LinkedList_6_InsertAtFirstNLast {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        l.addFirst(0);
        l.addLast(6);
        System.out.println("After inserting at first and Last Position: "+l);
    }
}
