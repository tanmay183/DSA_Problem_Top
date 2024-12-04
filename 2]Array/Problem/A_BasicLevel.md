https://www.geeksforgeeks.org/find-second-largest-element-array/

class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            // If the array is null or has fewer than 2 elements, return -1.
            return -1;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // Update secondLargest before updating largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update secondLargest only if the current number is not equal to the largest
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest; // Return -1 if no second largest
    }
}
.........................................................................................................................................

https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array/

class Solution {
    public int[] getThreeLargest(int[] arr) {
        // Variables to store the three largest distinct numbers
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        // Traverse the array
        for (int num : arr) {
            if (num > first) {
                // Update first, second, and third
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                // Update second and third
                third = second;
                second = num;
            } else if (num > third && num != first && num != second) {
                // Update third
                third = num;
            }
        }

        // Handle cases where there are fewer than three distinct numbers
        if (third == Integer.MIN_VALUE) {
            if (second == Integer.MIN_VALUE) {
                return new int[]{first};
            } else {
                return new int[]{first, second};
            }
        }

        // Return the result in descending order
        return new int[]{first, second, third};
    }
}

.........................................................................................................................................

https://www.geeksforgeeks.org/leaders-in-an-array/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
           
            int j;
            
            for (j = i + 1; j < n; j++) { //it run for single element in outer loop compared with remaining element.
                                          //if remaining element not greater than this and it reach each end add j
              
                
                if (arr[i] < arr[j])
                    break;
            }
            
            
            if (j == n)
                result.add(arr[i]);
        }
        
        return result;
    }
}

.........................................................................................................................................

https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/

 static boolean arraySortedOrNot(int arr[], int n)
    {

        // Array has one or no element
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)

            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;

        // No unsorted pair found
        return true;
    }

.........................................................................................................................................

https://www.geeksforgeeks.org/remove-duplicates-sorted-array/

class GfG {

    static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return n;
        
        // Start from the second element
        int idx = 1; 
      
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

.........................................................................................................................................
https://www.geeksforgeeks.org/complete-guide-on-array-rotations/

class Solution {
    static void rotateArray(int[] arr, int k) {  //Time Complexity : O(n) SC = O(1)
        int n = arr.length;
        
        // Handle cases where k > n
        k = k % n;
        
        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }
    
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

.........................................................................................................................................

https://www.geeksforgeeks.org/move-zeroes-end-array/

//using one traversal

import java.util.Arrays;

class GfG {

    // Function which pushes all zeros to end of array
    static void pushZerosToEnd(int[] arr) {

        // Pointer to track the position for next non-zero element
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                // Swap the current element with the 0 at index 'count'
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Move 'count' pointer to the next position
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

.........................................................................................................................................

https://www.geeksforgeeks.org/minimum-increment-k-operations-make-elements-equal/

class GFG {
    // function for calculating min operations
    static int minOps(int arr[], int n, int k)
    {
        // max elements of array
        int max = Integer.MIN_VALUE;
          for(int i=0; i<n; i++) {
            max = Math.max(max, arr[i]);
        }
        int res = 0;

        // iterate for all elements
        for (int i = 0; i < n; i++) {

            // check if element can make equal to
            // max or not if not then return -1
            if ((max - arr[i]) % k != 0)
                return -1;

            // else update res for required operations
            else
                res += (max - arr[i]) / k;
        }

        // return result
        return res;
    }

    // Driver program
    public static void main(String[] args)
    {
        int arr[] = { 21, 33, 9, 45, 63 };
        int n = arr.length;
        int k = 6;
        System.out.println(minOps(arr, n, k));
    }
}

.........................................................................................................................................

https://www.geeksforgeeks.org/minimum-cost-make-array-size-1-removing-larger-pairs/

public class GFG {
    
    // function to calculate the
    // minimum cost
    static int cost(int []a, int n)
    {
        int min = a[0];
        
        // find the minimum using
        // for loop
        for(int i = 1; i< a.length; i++)
        {
            if (a[i] < min)
                min = a[i];
        } 
        
        // Minimum cost is n-1 multiplied
        // with minimum element.
        return (n - 1) * min;
    }
    
    // driver program to test the
    // above function.
    static public void main (String[] args)
    {
        
        int []a = { 4, 3, 2 };
        int n = a.length;
        
        System.out.println(cost(a, n));
    }
}

.........................................................................................................................................
