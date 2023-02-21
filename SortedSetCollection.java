import java.util.*;

public class SortedSetCollection {

    public static void main(String[] args) {

        System.out.println("Collection - SortedSet\n");

        SortedSet<String> carData = new TreeSet<>();

        String car1 = "Mercedes";

        String car2 = "BMW";

        String car3 = "Rolls Roys";

        String car4 = "Jaguor";

        carData.add(car1);

        carData.add(car2);

        carData.add(car3);

        carData.add(car4);

        System.out.println("Car data: ");

        Iterator iterator = carData.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");

        }

        System.out.println();

        int size = carData.size();

        if (carData.isEmpty()) {

            System.out.println("Collection size:" + size);

        }

        System.out.println();

        carData.remove(car2);

        System.out.println("After removing [" + car2 + "]\n");
        iterator = carData.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next() + " ");

        }

        System.out.println();

        size = carData.size();

        System.out.println("Collection size:" + size + "\n");
        carData.clear();

        size = carData.size();

        if (carData.isEmpty()) {

            System.out.println("Collection is empty");

        } else {

            System.out.println("Collection size:" + size);

        }

    }

}
