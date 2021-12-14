import java.util.ArrayList;

public class ArrayList_16_CloneArraylistToAnotherList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        ArrayList<String> colorClone = (ArrayList)color.clone();
        System.out.println("ArrayList: "+color);
        System.out.println("Clone of List:  "+colorClone);


    }
}
