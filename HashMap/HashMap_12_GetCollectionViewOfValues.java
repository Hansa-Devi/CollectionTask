import java.util.Collections;
import java.util.HashMap;

public class HashMap_12_GetCollectionViewOfValues {
    public static void main(String[] args) {
        HashMap<String , String> rollNoName = new HashMap<String,String>();

        rollNoName.put("56","Hansa");
        rollNoName.put("41","Yasrab");
        rollNoName.put("110","Pireh");
        rollNoName.put("28","Aneeqa");

        System.out.println("collection view of values: "+rollNoName.values());
    }
}
