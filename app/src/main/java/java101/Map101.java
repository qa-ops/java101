package java101;

import java.util.HashMap;

public class Map101 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
//        Map<String, String> map = new HashMap<>();
        map.put("Name", "Rafael");
        map.put("Address", "UK");
        map.put("Phone", "11111111111");

        printMap(map);

        System.out.println("Map Size: " + map.size());

        System.out.println("Get by address key: " + map.get("Address"));

        System.out.println("Contains key: " + map.containsKey("Phone"));

        map.replace("Phone", "22222222222");
        printMap(map);

        map.remove("Address");
        printMap(map);
    }

    private static void printMap(HashMap<String, String> map) {
        System.out.println("=======MAP===========");

        map.forEach(
                (key, value) -> System.out.println(key + " : " + value)
        );

        System.out.println("==================");
    }
}
