import java.util.TreeMap;

public class TreeMap_1_CreateTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> student = new TreeMap<>();
        student.put(30,"Hadiqa");
        student.put(56,"Hansa");
        student.put(46,"Komal");
        student.put(40,"Tooba");
        student.put(54,"Anmol");
        student.put( 64,null);
        student.put( 4,null);

        System.out.println("TreeMAp of Students: "+student.entrySet());
    }
}
