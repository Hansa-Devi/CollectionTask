import java.util.ArrayList;

public class ArrayList_13_CompareTwoList {
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
        ArrayList<String> compare = new ArrayList<>();
        for (String ele: color) {
            compare.add(color2.contains(ele)?"Yes":"No");
        }
        System.out.println("List 1: "+color);
        System.out.println("List 2: "+color2);
        System.out.println("List 1 and list 2 comparison: "+compare);
    }
}
