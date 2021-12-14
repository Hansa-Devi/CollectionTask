import java.util.ArrayList;

public class ArrayList_20_IncreaseArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>(4);
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        System.out.println("Original arraylist: "+color+" Size: "+color.size());
        color.ensureCapacity(5);
        color.add("Green");
        System.out.println(color);
    }
}
