import java.util.HashSet;

public class HashSet_4_EmptyHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Four");
        hashSet.add("Two");
        hashSet.add("three");
        System.out.println(hashSet);
//        hashSet.clear();
        hashSet.removeAll(hashSet);

        System.out.println(hashSet);
    }
}
