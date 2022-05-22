package Level_2.Lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Human");
        arrayList.add("Human");
        arrayList.add("Dog");
        arrayList.add("Human");
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Human");
        arrayList.add("Red");
        arrayList.add("Dog");
        arrayList.add("Blue");
        arrayList.add("Gray");
        arrayList.add("Cat");
        arrayList.add("Waite");

        System.out.println(arrayList);


        Map<String, Integer> numberRepetitions = arrayList.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        numberRepetitions.forEach((k, v) -> System.out.println(k + ": " + v));

        Set<String> set = new HashSet<>(arrayList);

        System.out.println(set);

    }

}

