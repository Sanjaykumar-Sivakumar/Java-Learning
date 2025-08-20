import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Add at specific position
        list.add(1, "Blueberry");

        // Get element
        System.out.println("First item: " + list.get(0));

        // Set element
        list.set(0, "Avocado");

        // Remove by index
        list.remove(2);

        // Remove by value
        list.remove("Banana");

        // Size of list
        System.out.println("Size: " + list.size());

        // Check if empty
        System.out.println("Is Empty: " + list.isEmpty());

        // Check if contains
        System.out.println("Has Apple? " + list.contains("Apple"));

        // Index of item
        System.out.println("Index of Blueberry: " + list.indexOf("Blueberry"));

        // Last index of item
        list.add("Blueberry");
        System.out.println("Last index of Blueberry: " + list.lastIndexOf("Blueberry"));

        // Clone list
        ArrayList<String> copy = (ArrayList<String>) list.clone();

        // Sublist
        System.out.println("SubList: " + list.subList(0, 2));

        // Clear list
        list.clear();
        System.out.println("After clear: " + list);

        // Add all from another list
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Fig");
        newList.add("Grape");
        list.addAll(newList);

        // Contains all
        System.out.println("Contains all? " + list.containsAll(newList));

        // Remove all
        list.removeAll(newList);

        // Retain all
        list.add("Kiwi");
        list.add("Mango");
        list.retainAll(newList);  // Keeps only elements also in newList

        // To array
        Object[] array = list.toArray();

        // To typed array
        String[] strArray = list.toArray(new String[0]);

        // Final output
        System.out.println("Final list: " + list);
    }
}
