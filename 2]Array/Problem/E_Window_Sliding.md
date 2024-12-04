What is Window Sliding Technique?
The Window Sliding Technique is used to solve problems that involve finding a subarray or a range of elements in an array or string. This technique is particularly useful for optimizing brute force solutions by maintaining a "window" that represents a portion of the data, rather than iterating through all possible subarrays.

How Does It Work?
Define a Window:
A "window" is a subset of the data structure (e.g., a subarray or substring) defined by two pointers, start and end.
The size of the window can be fixed or variable, depending on the problem.

Slide the Window:
Move the pointers to expand or shrink the window to meet the desired condition.
Avoid redundant calculations by reusing results from the previous window.

Use Cases:
Find the maximum or minimum in every subarray of size k.
Find the longest substring with at most k distinct characters.
Count subarrays that satisfy certain conditions.

........................................................................................................................................

// E_Window_Sliding.java
import java.util.*;

public class E_Window_Sliding {

    // Function to find the maximum sum of a subarray of size k
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            throw new IllegalArgumentException("Array size must be greater than or equal to k");
        }

        int maxSum = 0;
        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // Add next element and remove first element of the previous window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    // Function to find the length of the longest substring with at most k distinct characters
    public static int longestSubstringWithKDistinct(String s, int k) {
        int n = s.length();
        if (n == 0 || k == 0) return 0;

        Map<Character, Integer> charFrequency = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char endChar = s.charAt(end);
            charFrequency.put(endChar, charFrequency.getOrDefault(endChar, 0) + 1);

            // Shrink the window until it has at most k distinct characters
            while (charFrequency.size() > k) {
                char startChar = s.charAt(start);
                charFrequency.put(startChar, charFrequency.get(startChar) - 1);
                if (charFrequency.get(startChar) == 0) {
                    charFrequency.remove(startChar);
                }
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    // Main method to demonstrate the technique
    public static void main(String[] args) {
        // Example 1: Maximum Sum Subarray of Size K
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));

        // Example 2: Longest Substring with At Most K Distinct Characters
        String s = "araaci";
        int kDistinct = 2;
        System.out.println("Length of longest substring with at most " + kDistinct + " distinct characters: " 
                            + longestSubstringWithKDistinct(s, kDistinct));
    }
}
.............................................................................................................................................

Now after this visit on GFG to check problem :
https://www.geeksforgeeks.org/array-data-structure-guide/

