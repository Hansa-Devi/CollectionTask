import java.util.LinkedList;

public class LinkedList_19_RemoveAndReturnFirstElement {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        System.out.println("List  : "+l1);
        l1.pop();
        System.out.println("List after popping first element: "+l1);

    }
}
