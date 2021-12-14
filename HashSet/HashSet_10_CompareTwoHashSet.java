import java.util.HashSet;
import java.util.Iterator;

public class HashSet_10_CompareTwoHashSet {
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

        for (int i : hashSet1) {
            System.out.println(hashSet2.contains(i) ? "Yes" : "No");
        }





        }

        }


