package java101;

import java.util.ArrayList;

public class ArrayList101 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Object 1");
        list.add("Object 2");
        printArrayList(list);

        System.out.println("Size arraylist: " + list.size());
        System.out.println("ArrayList 0: " + list.get(0));
        System.out.println("Have 'Object 1': " + list.contains("Object 1"));
        System.out.println("Have 'Another Object': " + list.contains("Another Object"));
        try {
            System.out.println("ArrayList 9 :" + list.get(9));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("ArrayList 9 index out of bound exception");
        }

        list.add("Object 3");
        printArrayList(list);

        list.add(1, "Object 1.5");
        printArrayList(list);

        list.remove(1);
        printArrayList(list);

        list.add("Object 2");
        printArrayList(list);

        list.remove("Object 5");
        printArrayList(list);

        list.remove("Object 2");
        printArrayList(list);
    }

    private static void printArrayList(ArrayList<String> list) {
        StringBuilder listString = new StringBuilder();
        for (String item:
             list ) {
            listString.append(item).append(" | ");
        }

        System.out.println(listString);
    }
}
