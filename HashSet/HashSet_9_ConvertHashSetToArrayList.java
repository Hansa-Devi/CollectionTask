import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_9_ConvertHashSetToArrayList {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        System.out.println("HashSet: "+hashSet);

        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);

        System.out.println("HashSet To ArrayList: "+arrayList);
    }
}
