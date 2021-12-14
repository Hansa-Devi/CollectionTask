import java.util.HashMap;

public class HashMap_5_CheckHashMapIsEmpty {
    public static void main(String[] args) {

        HashMap<String , String> rollNoName = new HashMap<String,String>();

        rollNoName.put("56","Hansa");
        rollNoName.put("41","Yasrab");
        rollNoName.put("110","Pireh");
        rollNoName.put("28","Aneeqa");

        System.out.println("HashMap of Students: "+rollNoName);
        System.out.println("Check HashMap is Empty: "+rollNoName.isEmpty());

        rollNoName.clear();
        System.out.println("HashMap After Removing all: "+rollNoName);
        System.out.println("Check HashMap is Empty: "+rollNoName.isEmpty());

    }
}
