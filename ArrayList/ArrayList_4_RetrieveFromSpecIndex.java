import java.util.ArrayList;

public class ArrayList_4_RetrieveFromSpecIndex {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Name:");
        list.add("FatherName:");
        list.add("RollNo");

        System.out.println(list);
        System.out.println("Element at index 2: "+list.get(2));
    }
}
