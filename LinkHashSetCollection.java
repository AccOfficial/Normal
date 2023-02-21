import java.util.*;

public class LinkHashSetCollection {

    public static void main(String[] args) {

        System.out.println("Collection - LinkedHash Set");

        LinkedHashSet<String> carData = new LinkedHashSet<>();

        String car1 = "Santro";

        String car2 = "Esteem";

        String car3 = "Accent";

        String car4 = "Xylo";

        carData.add(car1);

        carData.add(car2);

        carData.add(car3);

        carData.add(car4);

        System.out.println("Car Data : ");

        Iterator iterator = carData.iterator();

        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");

        }

        int size = carData.size();

        if (carData.isEmpty()) {

            System.out.println("Collection is empty");

        } else {

            System.out.println("Collection size: " + size);

        }

        carData.remove(car2);

        System.out.println("After Removing [" + car2 + "]\n");

        System.out.println("Now collection data: ");

        iterator = carData.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next() + " ");

        }

        size = carData.size();

        System.out.println("Collection size: " + size);

        carData.clear();

        size = carData.size();

        if (carData.isEmpty()) {

            System.out.println("Collection is empty");

        } else {

            System.out.println("Collection size: " + size);

        }

    }

}