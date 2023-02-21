import java.util.*;

public class HashsetCollection {

    public static void main(String[] args) {

        System.out.println("Collection - HashSet\n");

        // creating a hashset collection

        HashSet<String> carData = new HashSet<>();

        String car1 = "Mercedes";

        String car2 = "BMW";

        String car3 = "Jaguar";

        String car4 = "Rolls Royce";

        // Adding data in the collection

        carData.add(car1);

        carData.add(car2);

        carData.add(car3);

        carData.add(car4);

        System.out.println("Car data:");

        // Creating an iterator

        Iterator iterator = carData.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next() + " ");

        }

        System.out.println();

        int size = carData.size();

        if (carData.isEmpty()) {

            System.out.println("Collection is empty");

        } else {

            System.out.println("Collection size:" + size);

        }
        System.out.println();
        // removing a specific data from the collection
        carData.remove(car2);
        System.out.println("After removing[" + car2 + "]\n");
        System.out.println("Now collection data: ");
        iterator = carData.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next() + " ");
        }

        System.out.println();

        size = carData.size();

        System.out.println("Collection size: " + size + "\n");

        carData.clear();

        size = carData.size();

        if (carData.isEmpty()) {

            System.out.println("Collection is empty");

        } else {

            System.out.println("Collection size:" + size);

        }

    }
}