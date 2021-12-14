import java.util.TreeMap;

public class TreeMap_12_GetGreatestKeyLessThanOrEqualToGivenKey {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(30,"Hadiqa");
        treeMap.put(56,"Hansa");
        treeMap.put(46,"Komal");
        treeMap.put(40,"Tooba");
        treeMap.put(54,"Anmol");
        System.out.println("TreeMap 1 : "+treeMap.entrySet());
        System.out.println("Greatest key , <= 56: "+treeMap.floorKey(56));
        System.out.println("Greatest key , <= 31: "+treeMap.floorKey(31));
        System.out.println("Greatest key , <= 23: "+treeMap.floorKey(23));
    }
}
