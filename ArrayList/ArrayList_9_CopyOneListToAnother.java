import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_9_CopyOneListToAnother {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        ArrayList list2 = new ArrayList(list1);

        ArrayList list3 = new ArrayList();
        list3.addAll(list1);

        System.out.println("List 1 :"+list1);
        System.out.println("List 2: "+list2);
        System.out.println("List 3: "+list3);

        ArrayList list4 = new ArrayList();
        list4.add("1");
        list4.add("2");
        list4.add("3");

        System.out.println("List 4: "+list4);
        Collections.copy(list4,list1);
        System.out.println("List 4 After copying list 1: "+list4);



    }
}
