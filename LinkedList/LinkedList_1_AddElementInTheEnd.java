import java.util.LinkedList;

public class LinkedList_1_AddElementInTheEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("One");
        list.add("two");
        System.out.println(list);
        list.addLast("Last element ten");
        System.out.println(list);
    }
}
