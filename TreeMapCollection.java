import java.util.*;

public class TreeMapCollection {

    public static void main(String[] args) {

        System.out.println("Collection - Tree Map\n");

        TreeMap<String, Integer> tMap = new TreeMap<>();

        tMap.put("Ram", 23);

        tMap.put("Shyam", 20);

        tMap.put("Mohan", 24);

        tMap.put("Kumar", 22);

        tMap.put("Rohan", 23);

        tMap.put("Peyush", 26);

        tMap.put("Rushikesh", 23);

        System.out.println("Retrieving the keys and values: ");

        Iterator it = tMap.keySet().iterator();

        Object obj;

        while (it.hasNext()) {

            obj = it.next();

            System.out.println(obj + ":" + tMap.get(obj));

        }

        System.out.println("\nRetrieving the Value (age) of key [Deep]:" + tMap.get("Deep") + "\n");

        System.out.println(
                "Retrieving the First Key: " + tMap.firstKey() + "-Age[Value]: " + tMap.get(tMap.firstKey()) + "\n");

        System.out.println(
                "Retrieving the Last Key: " + tMap.lastKey() + "-Age[Value]: " + tMap.get(tMap.lastKey()) + "\n");

        System.out.println("Removing first data:" + tMap.remove(tMap.firstKey()));

        it = tMap.keySet().iterator();

        while (it.hasNext()) {

            obj = it.next();

            System.out.println(obj + ": " + tMap.get(obj));

        }

        System.out.println("\nRetrieving last data:" + tMap.remove(tMap.lastKey()));

        it = tMap.keySet().iterator();

        while (it.hasNext()) {

            obj = it.next();

            System.out.println(obj + ": " + tMap.get(obj));

        }

    }

}
