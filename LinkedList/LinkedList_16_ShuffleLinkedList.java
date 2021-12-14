import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_16_ShuffleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        System.out.println("Original List: "+l1);
        Collections.shuffle(l1);
        System.out.println("List After Shuffling: "+l1);
    }
}
