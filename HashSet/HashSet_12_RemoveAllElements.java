import java.util.HashSet;

public class HashSet_12_RemoveAllElements {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        hashSet1.add(2);
        hashSet1.add(1);
        hashSet1.add(3);
        System.out.println("HashSet 1: "+hashSet1);

//        hashSet1.removeAll(hashSet1);
        hashSet1.clear();
        System.out.println("After removing all elements: "+hashSet1);

    }
}
