import java.util.ArrayList;

public class ArrayList_3_InsertAtFirstIndex {
    public static void main(String[] args) {

            ArrayList colorList = new ArrayList();
            colorList.add("Pink");
            colorList.add("Blue");
            colorList.add("Red");

            System.out.println(colorList);
            System.out.println("Insert at first index:");
            colorList.add(0,"Black");
            System.out.println(colorList);

        }
    }

