import java.util.TreeMap;

public class TreeMap_20_RemoveAndGetGreatestKeyValuePair {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(30, "Hadiqa");
        treeMap.put(56, "Hansa");
        treeMap.put(46, "Komal");
        treeMap.put(40, "Tooba");
        treeMap.put(54, "Anmol");
        System.out.println("TreeMap 1 : " + treeMap.entrySet());
        System.out.println("Removed and get key-value pair of least key: "+treeMap.pollLastEntry());
        System.out.println("TreeMap : " + treeMap.entrySet());
    }
}
