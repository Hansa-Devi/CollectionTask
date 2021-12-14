import java.util.ArrayList;

public class ArrayList_12_ExtractPortionOfList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Blue");
        color.add("Green");
        System.out.println(color);
        System.out.println("Sublist from index 3 to 5: "+color.subList(3,6));
    }
}
