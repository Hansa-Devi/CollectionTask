import java.util.LinkedList;

public class LinkedList_25_TestIsEmptyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        l1.add("yellow");
        System.out.println("List: "+l1);
        System.out.println("Is list empty: "+l1.isEmpty());
        l1.clear();
        System.out.println("List: "+l1);
        System.out.println("Is list empty: "+l1.isEmpty());
    }
}
