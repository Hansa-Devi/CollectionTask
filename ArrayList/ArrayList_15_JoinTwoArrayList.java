import java.util.ArrayList;

public class ArrayList_15_JoinTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        ArrayList<String> color2 = new ArrayList<>();
        color2.add("Red");
        color2.add("White");
        color2.add("Pink");
        color2.add("Blue");
        ArrayList<String> join = new ArrayList<>();
        join.addAll(color);
        join.addAll(color2);
        System.out.println(color);
        System.out.println(color2);
        System.out.println(join);
    }
}
