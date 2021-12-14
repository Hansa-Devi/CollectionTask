import java.util.LinkedList;

public class LinkedList_12_RemoveSpecificElement {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        l.remove((Integer) 5);
        System.out.println(l);
    }
}
