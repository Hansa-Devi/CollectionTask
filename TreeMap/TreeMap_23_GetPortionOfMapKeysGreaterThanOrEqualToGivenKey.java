import java.util.TreeMap;

public class TreeMap_23_GetPortionOfMapKeysGreaterThanOrEqualToGivenKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(30, "Hadiqa");
        treeMap.put(56, "Hansa");
        treeMap.put(46, "Komal");
        treeMap.put(40, "Tooba");
        treeMap.put(54, "Anmol");
        System.out.println("TreeMap 1 : " + treeMap.entrySet());
        System.out.println("Portion of Map, Keys Greater Than Or Equal to key 45: "+treeMap.tailMap(45));

    }
}
