import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_14_SwapTwoElements {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Blue");
        color.add("Green");
        System.out.println("List before operation: "+color);
        Collections.swap(color,3,0);
        System.out.println("List after swapping index 3 nd 0: "+color);
    }
}
