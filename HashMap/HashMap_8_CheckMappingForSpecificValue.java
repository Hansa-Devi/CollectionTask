import java.util.HashMap;

public class HashMap_8_CheckMappingForSpecificValue {
    public static void main(String[] args) {
        HashMap<String , String> rollNoName = new HashMap<String,String>();

        rollNoName.put("56","Hansa");
        rollNoName.put("41","Yasrab");
        rollNoName.put("110","Pireh");
        rollNoName.put("28","Aneeqa");

        System.out.println("HashMap of Students: "+rollNoName);

        if (rollNoName.containsValue("Pireh"))
            System.out.println("Yes! There is mapping for value Pireh");
        else
            System.out.println("No!");

    }
}
