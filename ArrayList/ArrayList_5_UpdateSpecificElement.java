import java.util.ArrayList;

public class ArrayList_5_UpdateSpecificElement {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Name:");
        list.add("FatherName:");
        list.add("RollNo");

        System.out.println(list);
        System.out.println("Update at index 1:"+list.set(1,"LastName:"));
        System.out.println(list);

    }
}
