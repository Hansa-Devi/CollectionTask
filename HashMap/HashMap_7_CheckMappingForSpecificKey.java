import java.util.HashMap;

public class HashMap_7_CheckMappingForSpecificKey {
    public static void main(String[] args) {
        HashMap<String , String> rollNoName = new HashMap<String,String>();

        rollNoName.put("56","Hansa");
        rollNoName.put("41","Yasrab");
        rollNoName.put("110","Pireh");
        rollNoName.put("28","Aneeqa");

        System.out.println("HashMap of Students: "+rollNoName);

        if (rollNoName.containsKey("56"))
            System.out.println("Yes! "+"56 is key of "+rollNoName.get("56"));
        else
            System.out.println("No!");

    }
}
