import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_7_ConvertHashSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        System.out.println("HashSet: "+hashSet);

        int [] arr = new int[hashSet.size()];
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = it.next();
            }
        }

        System.out.println("HashSet to Array:" + Arrays.toString(arr));

    }
}
