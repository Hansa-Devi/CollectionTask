import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_11_ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        System.out.println(color);
        Collections.reverse(color);
        System.out.println(color);

    }
}
