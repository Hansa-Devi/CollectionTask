import java.util.ArrayList;

public class ArrayList_21_ReplaceSecondElement {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(4);
        list.add("One");
        list.add("two");
        list.add("Three");
        list.add("Four");
        System.out.println(list);
        list.set(1,"Two");
        System.out.println("Replace 2nd element: "+list);
    }
}
