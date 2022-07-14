package java101;

import java.util.HashSet;
import java.util.Set;

public class Set101 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Object 1");
        set.add("Object 2");

        printSet(set);

        set.add("Object 2");

        printSet(set);
        //how to get a set element
    }

    private static void printSet(Set<String> set) {
        StringBuilder listString = new StringBuilder();
        for (String item:
                set ) {
            listString.append(item).append(" | ");
        }

        System.out.println(listString);
    }
}
