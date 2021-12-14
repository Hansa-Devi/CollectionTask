import java.util.LinkedList;

public class LinkedList_22_CheckIsElementExists {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        System.out.println(l1);
        System.out.println("Does list contain black: "+l1.contains("Black"));
    }
}
