import java.util.LinkedList;

public class LinkedList_26_ReplaceElementInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        l1.add("yellow");
        System.out.println("Original list: "+l1);
        l1.set(1,"Brown");
        System.out.println("Replace index 1 element with \"Brown\" : \n"+l1);

    }
}
