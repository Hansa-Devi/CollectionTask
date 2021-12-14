import java.util.Collections;
import java.util.TreeMap;

public class TreeMap_18_GetNavigableSetOfKeys {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.put(30, "Hadiqa");
        treeMap.put(56, "Hansa");
        treeMap.put(46, "Komal");
        treeMap.put(40, "Tooba");
        treeMap.put(54, "Anmol");
        System.out.println("TreeMap 1 : " + treeMap.entrySet());
        System.out.println("Navigable Set of Keys:"+treeMap.navigableKeySet());

    }
}
