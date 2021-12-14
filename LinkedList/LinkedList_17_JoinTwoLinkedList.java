import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_17_JoinTwoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        LinkedList<String> l2 = new LinkedList<String>();
        LinkedList<String> l3 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        System.out.println("List 1 : "+l1);
        l2.add("One");
        l2.add("Two");
        l2.add("Three");
        l2.add("Four");
        l2.add("Five");
        System.out.println("List 2 : "+l2);
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println("Joined list1 and list2  \n"+l3);
    }
}
