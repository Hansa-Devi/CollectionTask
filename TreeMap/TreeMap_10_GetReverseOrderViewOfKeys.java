import java.util.TreeMap;

public class TreeMap_10_GetReverseOrderViewOfKeys {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(30,"Hadiqa");
        treeMap.put(56,"Hansa");
        treeMap.put(46,"Komal");
        treeMap.put(40,"Tooba");
        treeMap.put(54,"Anmol");
        System.out.println("TreeMap 1 : "+treeMap.entrySet());
        System.out.println("reverse Order Keys View: "+treeMap.descendingKeySet());
    }
}
