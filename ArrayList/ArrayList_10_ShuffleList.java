import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_10_ShuffleList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        System.out.println(color);
        Collections.shuffle(color);
        System.out.println(color);
    }
}
