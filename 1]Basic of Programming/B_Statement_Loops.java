import java.util.*;

public class B_Statement_Loops{

    public static void main(String [] args){

//Conditional Statement............

    // Example of if, else if, and else
        int number = 10;
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is zero");
        }

        // Example of nested if
        int age = 20;
        if (age > 18) {
            if (age < 60) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior Citizen");
            }
        } else {
            System.out.println("Minor");
        }

        // Example of switch-case
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break; // Exit switch after matching case
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        // Example of break in a loop
        System.out.println("Example of break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit loop when i is 3  o/p: 1,2
            }
            System.out.println("i = " + i);
        }

        // Example of continue in a loop
        System.out.println("Example of continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the rest of the loop body when i is 3  o/p:1,2,4,5
            }
            System.out.println("i = " + i);
        }


//Loops in java........

        // 1. For loop: Use when the number of iterations is known.
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop, Iteration: " + i);
        }


        // 2. While loop: Use when the number of iterations is unknown and depends on a condition.
        int count = 1;
        while (count <= 5) {
            System.out.println("While Loop, Count: " + count);
            count++;
        }


        // 3. Do-While loop: Use when you need to execute the loop at least once.
        int number = 1;
        do {
            System.out.println("Do-While Loop, Number: " + number);
            number++;
        } while (number <= 5);


        // 4. For-Each loop (Enhanced For Loop): Use for iterating through collections or arrays.
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("For-Each Loop, Number: " + num);
        }


        // 5. Infinite loop: Use sparingly when the condition is always true (e.g., server listening).
        // Uncomment below code to test, but use break to avoid an infinite loop.
        /*
        while (true) {
            System.out.println("Infinite Loop, Break to Exit");
            break; // Exit the loop
        }
        */


        // 6. Nested loops: Use when working with multi-dimensional structures.
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Nested Loop, i = " + i + ", j = " + j);
            }
        }
        
    }
}