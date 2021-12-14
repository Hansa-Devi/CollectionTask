import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);
        list.add("Hansa");
        list.add("SoftwareEngineer");
        System.out.println("Size of list 1:"+ list.size());
        Iterator it =  list.iterator();
        System.out.println("Elements of list 1:");
        while (it.hasNext())
            System.out.println(it.next());
        ArrayList list2 = new ArrayList();
        list2.add("Hasnain");
        list2.add(list);
        System.out.println("Size of list 2:"+ list2.size());
        Iterator it2 =  list2.iterator();
        System.out.println("Elements of list 2:");
        while (it2.hasNext())
            System.out.println(it2.next());

        list.remove(1);
        System.out.println("Size of list 1: "+list.size());

        System.out.println(list2.get(0));
//        list2.retainAll(list);
        System.out.println(list2.retainAll(list));
        System.out.println("Size of list 2: "+list2.size());
//        list2.removeAll(list);
        System.out.println("Size of list 2: "+list2.size());

        System.out.println("hansa    : "+list.contains("Hansa"));

        System.out.println("Check is empty list: "+list.isEmpty());

        System.out.println("Check is empty list: "+list2.isEmpty());


        list.add(0,"Hello Pagal");
        System.out.println("Element at index 0: "+list.get(0));
        list.set(0,"Hansa");
        System.out.println("Element at index 0: "+list.get(0));
        System.out.println("Index of element Hansa is: "+list.indexOf("Hansa"));
        System.out.println("Last index of hansa: "+list.lastIndexOf("Hansa"));
        System.out.println(list.remove(0));
        System.out.println(list.get(0));



    }
}
