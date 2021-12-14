import java.util.HashSet;

public class HashSet_11_CompareAndRetain {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        hashSet1.add(2);
        hashSet1.add(1);
        hashSet1.add(3);
        System.out.println("HashSet 1: "+hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<Integer>();
        hashSet2.add(2);
        hashSet2.add(5);
        hashSet2.add(3);
        System.out.println("HashSet 2: "+hashSet2);

        System.out.println("HashSets same elements:");
        hashSet1.retainAll(hashSet2);
        System.out.println(hashSet1);

    }
}
