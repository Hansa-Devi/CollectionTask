import java.util.HashSet;

public class HashSet_5_TestHashSetIsEmpty {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Four");
        hashSet.add("Two");
        hashSet.add("three");
        System.out.println(hashSet);
        System.out.println("Is empty: "+hashSet.isEmpty());
        hashSet.clear();
        System.out.println("Is empty: "+hashSet.isEmpty());
    }
}
