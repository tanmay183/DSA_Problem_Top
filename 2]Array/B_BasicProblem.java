public class B_BasicProblem {

    // 1. Linear Search
    // Logic: Traverse the array to find the key. If found, return its index; otherwise, return -1.
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Input: number[] = {2, 4, 6, 8, 10, 12, 14, 16}, key = 10
    // Output: key at index 4



    // 2. Binary Search
    // Logic: Divide the array into halves and compare the middle element with the key. Time complexity: O(log n).
    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Input: number[] = {2, 4, 6, 8, 10, 12, 14}, key = 10
    // Output: index for key is 4



    // 3. Reverse an Array (No Extra Space)
    // Logic: Swap elements from the beginning and end of the array until the middle is reached.
    public static void reverseArray(int number[]) {
        int first = 0, last = number.length - 1;

        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    // Input: number[] = {2, 4, 6, 8, 10}
    // Output: Reversed array = {10, 8, 6, 4, 2}



    // 4. Pair of an Array
    // Logic: For each element, pair it with every subsequent element and count the total pairs.
    public static void printPair(int number[]) {
        int totalPair = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + current + "," + number[j] + ") ");
                totalPair++;
            }
        }
        System.out.println("\nTotal pairs are " + totalPair);
    }

    // Input: number[] = {2, 4, 6, 8, 10}
    // Output: All pairs = (2,4), (2,6), ..., (8,10); Total pairs = 10



    // 5. Print Sub-Array
    // Logic: Generate all possible subarrays by varying start and end indices and print them.
    public static void printSubarray(int number[]) {
        int totalSubarray = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                totalSubarray++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays: " + totalSubarray);
    }

    // Input: number[] = {2, 4, 6, 8, 10}
    // Output: All subarrays and Total subarrays = 15



    // 6. Max SubArray Sum (Brute Force)
    // Logic: Calculate sum for all subarrays and track the maximum sum.
    public static void maxSubarraySumBruteForce(int number[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += number[k];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }

    // Input: number[] = {1, -2, 6, -1, 3}
    // Output: Maximum sum = 8



    // 7. Max SubArray Sum (Prefix Sum) (O^2)
    // Logic: Use prefix sums to calculate subarray sums in O(1) time and track the maximum sum.
    public static void maxSubarraySumPrefix(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) { //prefix summ
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }

    // Input: number[] = {1, -2, 6, -1, 3}
    // Output: Maximum sum = 8


    // 8. Max SubArray Sum (Kadane's Algorithm) O(n)
    // Logic: Continuously add elements to the current sum; reset to 0 if it becomes negative. Track maximum sum.
    public static void kadanesAlgorithm(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < number.length; i++) {
            currSum += number[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum sum by Kadane's Algorithm = " + maxSum);
    }

    // Input: number[] = {-2, -3, 4, -1, -2, 1, 5, -3}
    // Output: Maximum sum by Kadane's Algorithm = 7
    

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        int key = 10;

        // Linear Search
        System.out.println("Key at index: " + linearSearch(number, key));

        // Binary Search
        System.out.println("Index for key: " + binarySearch(number, key));

        // Reverse Array
        reverseArray(number);
        System.out.print("Reversed array: ");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Pair of Array
        printPair(number);

        // Print Subarray
        printSubarray(number);

        // Max SubArray Sum (Brute Force)
        int number2[] = {1, -2, 6, -1, 3};
        maxSubarraySumBruteForce(number2);

        // Max SubArray Sum (Prefix Sum)
        maxSubarraySumPrefix(number2);

        // Max SubArray Sum (Kadane's Algorithm)
        kadanesAlgorithm(number2);
    }
}
