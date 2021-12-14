import java.util.ArrayList;

public class ArrayList_18_TestArrayListIsEmpty {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        System.out.println(color);
        System.out.println("Check list is empty of not: "+color.isEmpty());
        color.clear();
        System.out.println(color);
        System.out.println("Check list is empty of not: "+color.isEmpty());
    }
}
