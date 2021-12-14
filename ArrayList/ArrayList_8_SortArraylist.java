import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_8_SortArraylist {
    public static void main(String[] args) {
        ArrayList colorList = new ArrayList();
        colorList.add("Pink");
        colorList.add("Blue");
        colorList.add("Red");

        System.out.println("Before Sorting List: "+colorList);
        Collections.sort(colorList);
        System.out.println("After Sorting List: "+colorList);

    }
}
