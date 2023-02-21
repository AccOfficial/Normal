
import java.util.*;

public class TreeSetCollection {

    public static void main(String[] args) {
        System.out.print("Collection - Tree Set\n");
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Sunday");
        tree.add("Monday");
        tree.add("Tuesday");
        tree.add("Wednesday");
        tree.add("Thurday");

        tree.add("Friday");

        Iterator iterator = tree.iterator();

        System.out.print("Tree set data:");

        while (iterator.hasNext()) {

            System.out.println(iterator.next() + " ");

        }

        System.out.println();

        if (tree.isEmpty()) {

            System.out.println("Tree set is empty");

        } else {

            System.out.println("Tree set size:" + tree.size());

        }

        System.out.println("First data:" + tree.first());

        System.out.println("Last data:" + tree.last());

        if (tree.remove("Sunday")) {

            System.out.println("Data is removed from the set");

        } else {

            System.out.println("Data doesn't exist!");

        }

        System.out.println("Now the tree set contain:");

        iterator = tree.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next() + " ");

        }

        System.out.println();

        System.out.println("Now the size of tree set: " + tree.size());

        tree.clear();

        if (tree.isEmpty()) {

            System.out.println("Tree Set is empty.");

        } else {

            System.out.println("Tree set size:" + tree.size());

        }

    }

}