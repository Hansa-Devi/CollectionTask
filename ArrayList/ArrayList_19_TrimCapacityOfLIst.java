import java.util.ArrayList;

public class ArrayList_19_TrimCapacityOfLIst {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        System.out.println("Original arraylist: "+color+" Size: "+color.size());
        color.trimToSize();
        System.out.println("Trim to Size Arraylist: "+color+" size is : "+color.size());

    }
}
