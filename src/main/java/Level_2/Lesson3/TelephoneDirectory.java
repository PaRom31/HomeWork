package Level_2.Lesson3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TelephoneDirectory {

    static Map<String, String> telephoneDirectory = new HashMap<>();

    public static void main(String[] args) {


        add("55652", "Smite");
        add("57652", "Johnson");
        add("55852", "Williams");
        add("55622", "Brown");
        add("55052", "Smite");
        add("55700", "Smite");

        for (Map.Entry<String, String> entry : telephoneDirectory.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        get("Smite");
        get("Brown");


    }

    public static void add(String k, String v) {

        telephoneDirectory.put(k, v);


    }

    public static void get(String v) {

        for (Map.Entry<String, String> map : telephoneDirectory.entrySet()) {
            if (v.equalsIgnoreCase(map.getValue())) {
                System.out.println("\n" + v + " phone number: " + map.getKey());
            }
        }

    }


}



