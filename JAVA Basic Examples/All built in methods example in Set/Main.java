import java.util.*;

class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Check if element exists
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // Remove an element
        set.remove("Banana");

        // Size of the set
        System.out.println("Size: " + set.size());

        // Iterate using forEach
        set.forEach(item -> System.out.println("Item: " + item));

        // Convert to array
        Object[] arr = set.toArray();
        System.out.println("First element in array: " + arr[0]);

        // Clear the set
        set.clear();
        System.out.println("Is set empty? " + set.isEmpty());
    }
}
