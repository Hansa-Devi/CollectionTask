import java.util.HashSet;

public class HashSet_6_CloneHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("HashSet: "+hashSet);
        HashSet<Integer> hashSet1 = (HashSet<Integer>) hashSet.clone();
        System.out.println("Clone of HashSet: "+hashSet1);
    }
}
