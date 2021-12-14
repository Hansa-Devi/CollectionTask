import java.util.ArrayList;

public class ArrayList_6_RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Name:");
        list.add("LastName:");
        list.add("FatherName:");
        list.add("RollNo");


        System.out.println(list);
        System.out.println("Remove third element: "+list.remove(2));
        System.out.println(list);
    }
}
