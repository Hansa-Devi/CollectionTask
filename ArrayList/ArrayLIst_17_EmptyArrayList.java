import java.util.ArrayList;

public class ArrayLIst_17_EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        System.out.println(color);
        color.clear();
        System.out.println(color);
    }
}
