import java.util.*;

public class A_Basic {
    public static void main(String[] args) {

// 1. Array Declaration and Initialization
        System.out.println("1. Array Declaration and Initialization");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 0); // Filling the array with 0
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));


// 2. Iterating Over an Array
        System.out.println("\n2. Iterating Over an Array");
        System.out.print("For loop: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\nEnhanced for loop: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }


// 3. Common Operations
        System.out.println("\n\n3. Common Operations");
        // Sum of elements
        int sum = 0;
        for (int num : arr1) {
            sum += num;
        }
        System.out.println("Sum of arr1: " + sum);

        // Maximum and Minimum
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : arr1) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println("Max: " + max + ", Min: " + min);


// 4. Sorting Arrays
        System.out.println("\n4. Sorting Arrays");
        Arrays.sort(arr1); // In-place sorting
        System.out.println("Sorted arr1: " + Arrays.toString(arr1));


// 5. Searching
        System.out.println("\n5. Searching");
        int index = Arrays.binarySearch(arr1, 3); // Binary search requires a sorted array
        System.out.println("Index of 3 in arr1: " + index);


// 6. Prefix Sum (Useful for Range Queries)
        System.out.println("\n6. Prefix Sum");
        int[] prefixSum = new int[arr1.length];
        prefixSum[0] = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr1[i];
        }
        System.out.println("Prefix Sum: " + Arrays.toString(prefixSum));



    }
}
