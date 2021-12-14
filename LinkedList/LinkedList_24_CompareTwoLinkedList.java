import java.util.LinkedList;

public class LinkedList_24_CompareTwoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Red");
        l1.add("White");
        l1.add("Black");
        l1.add("Green");
        l1.add("Blue");
        l1.add("yellow");
        System.out.println(l1);
        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("Red");
        l2.add("White");
        l2.add("Black");
        l2.add("Green");
        l2.add("Blue");
        System.out.println(l2);
        LinkedList<String> compareList = new LinkedList<>();
        for (String ele :l1) {
            compareList.add(l2.contains(ele)?"Yes":"No");
        }
        System.out.println(compareList);
    }
}
