import java.util.TreeMap;

public class TreeMap_15_GetLeastStrictlyGreaterKey {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(30,"Hadiqa");
        treeMap.put(56,"Hansa");
        treeMap.put(46,"Komal");
        treeMap.put(40,"Tooba");
        treeMap.put(54,"Anmol");
        System.out.println("TreeMap 1 : "+treeMap.entrySet());
        System.out.println("The least key strictly greater than the key:40 : "+treeMap.higherKey(40));
        System.out.println("The least key strictly greater than the key:56 : "+treeMap.higherKey(56));
        System.out.println("The least key strictly greater than the key:10 : "+treeMap.higherKey(10));

    }
}
