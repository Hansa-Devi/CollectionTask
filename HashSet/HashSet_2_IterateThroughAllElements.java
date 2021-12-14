import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2_IterateThroughAllElements {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Four");
        hashSet.add("Two");
        hashSet.add("three");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+",");
    }
}
