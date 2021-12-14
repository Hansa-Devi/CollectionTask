import java.util.LinkedList;

public class LinkedList_18_CloneListToAnotherList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        System.out.println("List 1 : "+l1);
        LinkedList<String>  l2 = (LinkedList<String>)l1.clone();
        System.out.println("Clone of List 1 : "+l2);
    }
}
