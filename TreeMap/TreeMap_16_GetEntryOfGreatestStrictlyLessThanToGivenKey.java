import java.util.TreeMap;

public class TreeMap_16_GetEntryOfGreatestStrictlyLessThanToGivenKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(30, "Hadiqa");
        treeMap.put(56, "Hansa");
        treeMap.put(46, "Komal");
        treeMap.put(40, "Tooba");
        treeMap.put(54, "Anmol");
        System.out.println("TreeMap 1 : " + treeMap.entrySet());
        System.out.println("The Greatest Strictly Less than key-value value of key 46 is: " + treeMap.lowerEntry(46));
        System.out.println("The Greatest Strictly Less than key-value value of key 30 is: " + treeMap.lowerEntry(30));
    }
}
