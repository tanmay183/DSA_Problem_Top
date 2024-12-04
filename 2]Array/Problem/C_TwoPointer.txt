How the Two Pointers Technique Works
Definition:
Two pointers are variables that are used to traverse a data structure (commonly an array or string).

These pointers can either:
Start from both ends of the array and move towards each other.
Start from the same point and move in a specific direction.

Logic:
The technique optimizes the process of finding pairs, subarrays, or specific elements by reducing the number of iterations. Instead of using two nested loops (O(n²)), it often brings the time complexity down to O(n).

Use Cases:
Finding pairs in a sorted array with a specific sum.
Removing duplicates in place.
Sorting colors or partitioning arrays.
Solving sliding window problems efficiently.
Handling palindrome and string-related problems.

Steps to Use:
Decide the initial positions of the two pointers (start, end, or any specific index).
Move the pointers based on conditions (e.g., sum too high, sum too low, etc.).
Stop when a condition is satisfied or the pointers cross.

.................................................................................................................................
Example Problem: Pair with Target Sum
Problem:
Find if a sorted array contains two numbers whose sum equals a target value.

Approach:
Use two pointers:
One starts at the beginning (left).
One starts at the end (right).
If the sum of the elements at these pointers is less than the target, move the left pointer to the right.
If the sum is greater, move the right pointer to the left.
Stop when you find a pair or the pointers cross.
.................................................................................................................................

// C_TwoPointer.java
import java.util.*;

public class C_TwoPointer {

    // Function to find two numbers in a sorted array that sum up to a target
    public static boolean hasPairWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                return true;
            } else if (sum < target) {
                left++; // Increase the sum
            } else {
                right--; // Decrease the sum
            }
        }

        System.out.println("No pair found.");
        return false;
    }

    // Example: Remove duplicates from a sorted array in-place
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int uniqueIndex = 0; // Pointer for unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }

    // Function to count subarrays whose product is less than k
    public static int countSubarraysWithProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int product = 1;
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            // Shrink the window until the product is less than k
            while (product >= k && left <= right) {
                product /= nums[left++];
            }

            // Add the count of subarrays ending at 'right'
            count += (right - left + 1);
        }

        return count;
    }

    // Main method to demonstrate the technique
    public static void main(String[] args) {
        // Example 1: Pair with Target Sum
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        hasPairWithSum(arr, target);

        // Example 2: Remove Duplicates
        int[] arrWithDuplicates = {1, 1, 2, 2, 3, 4, 4};
        int newLength = removeDuplicates(arrWithDuplicates);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arrWithDuplicates, newLength)));

        // Example 3: Subarray Product Less Than K
        int[] nums = {1, 9, 2, 8, 6, 4, 3};
        int k = 100;
        int subarrayCount = countSubarraysWithProductLessThanK(nums, k);
        System.out.println("Number of subarrays with product less than " + k + ": " + subarrayCount);
    }
}

.................................................................................................................................