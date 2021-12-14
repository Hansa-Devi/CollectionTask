import java.util.LinkedList;

public class LinkedList_9_InsertSomeElementAtSpecificPosition {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        l.addAll(1,l);
        System.out.println("After insert at index1 the same list : "+l);
    }
}
