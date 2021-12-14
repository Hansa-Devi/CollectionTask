import java.util.LinkedList;

public class LinkedList_14_removeAllElements {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
//        l.removeAll(l);
        l.clear();
        System.out.println(l);
    }
}
