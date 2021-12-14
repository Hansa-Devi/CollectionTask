import java.util.ArrayList;

public class ArrayList_22_PrintAllEleUsingPortion {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>(4);
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        System.out.println("Original arraylist: "+color+" Size: "+color.size());
        System.out.println("List form index 0 to 2");
        for (int i = 0; i <3 ; i++) {
            System.out.print(color.get(i)+",");
        }



    }
}
