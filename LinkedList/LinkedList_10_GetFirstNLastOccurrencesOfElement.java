import java.util.*;

public class LinkedList_10_GetFirstNLastOccurrencesOfElement {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(5);
        l.add(1);
        l.add(4);
        System.out.println("List: "+l);

        //method 1:

        firstOccurrence(l,1);
        lastOccurrence(l,1);


        //method 2:

//        ListIterator<Integer> iterator= l.listIterator();
//        while (iterator.hasNext()){
//            if (iterator.next().equals(1)) {
//                int index = iterator.nextIndex();
//                System.out.println("First occurrence of 1 at index: " +(index-1 ) );
//                break;
//            }
//        }
//        ListIterator<Integer> iterator2= l.listIterator(l.size());
//        while (iterator2.hasPrevious()){
//            if (iterator2.previous().equals(1)) {
//                int lastIndex = iterator2.previousIndex();
//                System.out.println("Last occurrence of 1 at index: " +(lastIndex+1));
//                break;
//            }
//        }
//
//
//


    }

    public static void firstOccurrence(List l, Object o){
        ListIterator<Integer> iterator= l.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(1)) {
                int index = iterator.nextIndex();
                System.out.println("First occurrence of 1 at index: " +(index-1 ) );
                break;
            }
        }

    }
    public static void lastOccurrence( List l ,Object o){
        ListIterator<Integer> iterator2= l.listIterator(l.size());
        while (iterator2.hasPrevious()){
            if (iterator2.previous().equals(o)) {
                int lastIndex = iterator2.previousIndex();
                System.out.println("Last occurrence of "+o+" at index: " +(lastIndex+1));
                break;
            }
        }
    }
}
