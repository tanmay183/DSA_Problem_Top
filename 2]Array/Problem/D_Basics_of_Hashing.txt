Basics of Hashing Technique
What is Hashing?
Hashing is a technique used to map data (keys) to a specific index in a hash table using a hash function. The main goal is to provide efficient lookups, insertions, and deletions in constant time on average.

How Does Hashing Work?
Hash Table: A data structure that stores data in key-value pairs.
Keys are processed through a hash function to compute an index in the table.


Hash Function: A function that takes a key and returns an index for the hash table.
Example: index = key % table_size.


Collision:
Occurs when two keys map to the same index.
Handled using techniques like Chaining or Open Addressing.

Advantages:
Fast lookups: O(1) on average.
Space-efficient for sparse data.

Common Use Cases:
Counting frequencies (e.g., count character occurrences in a string).
Finding duplicates.
Implementing sets or dictionaries.

.....................................................................................................................................

// D_Basics_of_Hashing.java
import java.util.*;

public class D_Basics_of_Hashing {

    // Function to count frequencies of elements in an array using HashMap
    public static void countFrequencies(int[] arr) {
        // Create a hash table using HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Traverse the array and update frequencies in the hash map
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            //Updates the frequency of num in freqMap by retrieving its current value (or 0 if it doesn't exist) and incrementing it by 1.
        }

        // Print the frequency of each element
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Function to find if a pair with a given sum exists in the array
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }

            seen.add(num);
        }

        System.out.println("No pair found.");
        return false;
    }

    // Function to check if an array contains duplicates
    public static boolean containsDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return true;
            }
            seen.add(num);
        }

        System.out.println("No duplicates found.");
        return false;
    }

    // Main method to demonstrate hashing
    public static void main(String[] args) {
        // Example 1: Frequency Count
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        countFrequencies(arr);

        // Example 2: Pair with Target Sum
        int[] arr2 = {1, 2, 3, 4, 6};
        int target = 8;
        hasPairWithSum(arr2, target);

        // Example 3: Check for Duplicates
        int[] arr3 = {1, 2, 3, 4, 5, 3};
        containsDuplicates(arr3);
    }
}
