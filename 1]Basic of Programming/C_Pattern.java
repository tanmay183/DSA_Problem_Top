import java.util.*;

public class C_Pattern {

//............................................Basic Pattern.................................................


    // Main method
    public static void main(String[] args) {

// Star Pattern
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*

*
**
***
****
 */


// Inverted Star Pattern
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*

****
***
**
*

 */

// Half Pyramid Pattern
        for (int line = 1; line <= 4; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }

/*
1
12
123
1234

 */

// Character Pattern
        char ch = 'A';
        for (int line = 1; line <= 4; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
/*
A
BC
DEF
GHIJ

 */

        // Advanced Patterns
        hollow_rectangle(4, 5);
        inverted_pyramid(4);
        inverted_no_pyramid(5);
        floyd_triangle(5);
        zero_one_triangle(5);
        butterfly_pattern(4);
        solid_rhombus(5);
        hollow_rhombus(5);
        diamond_pattern(4);
    }

    

//............................................Advance Pattern.................................................

// Method for Hollow Rectangle
    public static void hollow_rectangle(int totRows, int totCols) { // 4 , 5
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

/*

*****
*   *
*   *
*****

 */


// Method for Inverted and Rotated Pyramid
    public static void inverted_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*

   *
  **
 ***
****

 */


// Method for Inverted and Rotated Pyramid with Numbers
    public static void inverted_no_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */


// Method for Floyd's Triangle
    public static void floyd_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */



// Method for 0-1 Triangle
    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */


// Method for Butterfly Pattern
    public static void butterfly_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */



// Method for Solid Rhombus
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*
    *****
   *****
  *****
 *****
*****

 */


// Method for Hollow Rhombus
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

/*
    *****
   *   *
  *   *
 *   *
*****

 */


// Method for Diamond Pattern
    public static void diamond_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *

 */

    
}
