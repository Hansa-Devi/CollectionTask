import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_23_ConvertLinkedlistToArrayList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        System.out.println("Linkedlist: "+l1);
        ArrayList<String> arrList = new ArrayList(l1);
        System.out.println("LinkedList To ArrayList: "+arrList);
    }
}
