package activities;

import java.util.ArrayList;
import java.util.List;

public class Acticity9 {
    public static void main(String[] args) {
        
        
        List<String> strList = new ArrayList<>();

        
        strList.add("IBM");
        strList.add("CISCO");
        strList.add("GOOGLE");
        strList.add(1, "MICROSOFT");
        strList.add(0, "META");

        // 3. Print all the names using a for loop
        System.out.println("All names in strList:");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        String thirdName = strList.get(2); 
        System.out.println("\n3rd name in the list: " + thirdName);

        String searchName = "MICROSOFT";
        if (strList.contains(searchName)) {
            System.out.println(searchName + " exists in the list.");
        } else {
            System.out.println(searchName + " does not exist in the list.");
        }

        System.out.println("\nNumber of names in the list: " + strList.size());

        strList.remove("META");
        System.out.println("After removing 'META', size of list: " + strList.size());
    }
}
