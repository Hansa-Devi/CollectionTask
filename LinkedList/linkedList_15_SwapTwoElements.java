import java.util.Collections;
import java.util.LinkedList;

public class linkedList_15_SwapTwoElements {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        System.out.println("List: "+l);
        Collections.swap(l,3,4);
        System.out.println("List  after swapping index 3 and 4: "+l);
    }
}
