import java.util.LinkedList;

public class LinkedList_11_DisplayElementsAndTheirIndex {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        for (int i = 0; i < l.size() ; i++) {
            System.out.println("Element at index "+i+" is "+l.get(i));
        }
    }
}
