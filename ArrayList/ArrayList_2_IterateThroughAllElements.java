import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2_IterateThroughAllElements {
        public static void main(String[] args) {

            ArrayList colorList = new ArrayList();
            colorList.add("Pink");
            colorList.add("Blue");
            colorList.add("Red");

        Iterator it = colorList.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        }
}
