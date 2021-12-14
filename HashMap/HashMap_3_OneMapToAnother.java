import java.util.HashMap;

public class HashMap_3_OneMapToAnother {
    public static void main(String[] args) {
        HashMap<String , String> rollNoName = new HashMap<String,String>();
        rollNoName.put("56","Hansa");
        rollNoName.put("41","Yasrab");
        rollNoName.put("110","Pireh");
        rollNoName.put("28","Aneeqa");
        System.out.println("HashMap of Students: "+rollNoName);

        HashMap<String , String> rollNoName2 = new HashMap<String,String>();
        rollNoName2.putAll(rollNoName);
        System.out.println("Copy HashMap: "+rollNoName2);

    }
}
