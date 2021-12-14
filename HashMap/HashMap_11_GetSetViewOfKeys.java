import java.util.HashMap;

public class HashMap_11_GetSetViewOfKeys {
    public static void main(String[] args) {
        HashMap<String , String> rollNoName = new HashMap<String,String>();

        rollNoName.put("56","Hansa");
        rollNoName.put("41","Yasrab");
        rollNoName.put("110","Pireh");
        rollNoName.put("28","Aneeqa");

        System.out.println("set view of keys: "+rollNoName.keySet());
    }
}
