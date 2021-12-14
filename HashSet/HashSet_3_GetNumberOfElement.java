import java.util.HashSet;

public class HashSet_3_GetNumberOfElement {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Four");
        hashSet.add("Two");
        hashSet.add("three");
        System.out.println("Number of elements in hashSet: "+hashSet.size());
    }
}
