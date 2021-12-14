import java.util.LinkedList;

public class LinkedList_21_RetrieveLastElement {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        System.out.println(l1);
        System.out.println( l1.peekLast());
        System.out.println("After retrieving Last element \n"+l1);
    }
}
