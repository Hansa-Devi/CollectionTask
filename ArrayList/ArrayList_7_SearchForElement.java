import java.util.ArrayList;

public class ArrayList_7_SearchForElement {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Name:");
        list.add("FatherName:");
        list.add("RollNo");

        System.out.println(list);
        System.out.println("Search for element \"Name:\" in list: "+list.contains("Name:"));
    }
}
