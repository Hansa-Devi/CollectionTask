import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_8_ConvertHashSetToTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        System.out.println("HashSet: "+hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("HashSet To TreeSet: "+treeSet);
    }
}
