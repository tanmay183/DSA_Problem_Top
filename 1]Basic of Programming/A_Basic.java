import java.util.*;

/*

Advantages of Wrapper Classes:
        • Enable primitives to be used in collections like ArrayList.
        • Provide methods for converting between types (e.g., Integer.parseInt()).
        • Support autoboxing and unboxing for convenient coding.

• Autoboxing happens when the primitive int is automatically converted into an Integer object.
• Unboxing happens when the Integer object is automatically converted back into a primitive int.
• In the example, the ArrayList can only store objects, so Java automatically converts the primitive int to an Integer.

*/

public class A_Basic {
    public static void main(String[]args){

//Autoboxing.......
        int primitiveValue = 10; // Primitive type
        Integer wrapperObject = primitiveValue; // Autoboxing
        System.out.println("Primitive to Wrapper (Autoboxing): " + wrapperObject);

//Unboxing........
        Integer wrapperObject1 = 20; // Wrapper class object
        int primitiveValue1 = wrapperObject1; // Unboxing
        System.out.println("Wrapper to Primitive (Unboxing): " + primitiveValue1);


//Datatype in java...................

        // Integer types
        byte byteValue = 127;        // Size: 1 byte (8 bits), Range: -128 to 127
        short shortValue = 32767;    // Size: 2 bytes (16 bits), Range: -32,768 to 32,767
        int intValue = 2147483647;   // Size: 4 bytes (32 bits), Range: -2^31 to 2^31-1
        long longValue = 9223372036854775807L; // Size: 8 bytes (64 bits), Range: -2^63 to 2^63-1

        // Floating-point types
        float floatValue = 3.14f;    // Size: 4 bytes (32 bits), Precision: ~7 decimal digits
        double doubleValue = 3.141592653589793; // Size: 8 bytes (64 bits), Precision: ~15 decimal digits

        // Character type
        char charValue = 'A';        // Size: 2 bytes (16 bits), Range: 0 to 65,535 (Unicode)

        // Boolean type
        boolean booleanValue = true; // Size: 1 bit (but depends on JVM implementation)


//Operator in java.........

        // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));          // +
        System.out.println("Subtraction: " + (a - b));       // -
        System.out.println("Multiplication: " + (a * b));    // *
        System.out.println("Division: " + (a / b));          // /
        System.out.println("Modulus: " + (a % b));           // %

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));             // >
        System.out.println("a < b: " + (a < b));             // <
        System.out.println("a >= b: " + (a >= b));           // >=
        System.out.println("a <= b: " + (a <= b));           // <=
        System.out.println("a == b: " + (a == b));           // ==
        System.out.println("a != b: " + (a != b));           // !=

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));           // Logical AND
        System.out.println("x || y: " + (x || y));           // Logical OR
        System.out.println("!x: " + (!x));                   // Logical NOT

        // 4. Bitwise Operators
        int m = 6, n = 3; // 6 = 110, 3 = 011 (binary representation)
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n));             // Bitwise AND
        System.out.println("m | n: " + (m | n));             // Bitwise OR
        System.out.println("m ^ n: " + (m ^ n));             // Bitwise XOR
        System.out.println("~m: " + (~m));                   // Bitwise Complement
        System.out.println("m << 1: " + (m << 1));           // Left Shift
        System.out.println("m >> 1: " + (m >> 1));           // Right Shift

        // 5. Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5; // Equivalent to c = c + 5
        System.out.println("c += 5: " + c);
        c -= 2; // Equivalent to c = c - 2
        System.out.println("c -= 2: " + c);
        c *= 3; // Equivalent to c = c * 3
        System.out.println("c *= 3: " + c);
        c /= 3; // Equivalent to c = c / 3
        System.out.println("c /= 3: " + c);
        c %= 3; // Equivalent to c = c % 3
        System.out.println("c %= 3: " + c);

        // 6. Unary operator.....................

          int a = 10;
          int b = ++a; // pre increment -----> output a= 11  b= 11
          int b = a++; // post increment ------> output a= 11  b= 10

          int b = --a; // pre increment -----> output a= 9  b= 9
          int b = a--; // post increment ------> output a= 9  b= 10
          System.out.println(a); 
        
          System.out.println(b); 

        // 7. Ternary Operator
        int max = (a > b) ? a : b; //condition ? True : False
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + max);


//Input in java
        
        Scanner sc = new Scanner(System.in);

        // Input a String
        System.out.print("Enter a string: ");
        String stringInput = sc.nextLine(); // Reads entire line
        System.out.println("String Input: " + stringInput);

        // Input a Character
        System.out.print("Enter a character: ");
        char charInput = sc.next().charAt(0); // Reads a single character
        System.out.println("Character Input: " + charInput);

        // Input an Integer
        System.out.print("Enter an integer: ");
        int intInput = sc.nextInt();
        System.out.println("Integer Input: " + intInput);

        // Input a Float
        System.out.print("Enter a float: ");
        float floatInput = sc.nextFloat();
        System.out.println("Float Input: " + floatInput);

        // Input a Double
        System.out.print("Enter a double: ");
        double doubleInput = sc.nextDouble();
        System.out.println("Double Input: " + doubleInput);

        // Input a Boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanInput = sc.nextBoolean();
        System.out.println("Boolean Input: " + booleanInput);

//Type casting and promotion in java..........

        // Implicit Type Casting (Widening)
        int intVal = 100;
        long longVal = intVal; // int to long (smaller to larger type)
        float floatVal = longVal; // long to float
        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);

        // Explicit Type Casting (Narrowing)
        double doubleVal = 99.99;
        int castedInt = (int) doubleVal; // double to int (larger to smaller type)
        System.out.println("\nExplicit Casting:");
        System.out.println("double to int: " + castedInt);

        // Loss of Precision Example
        double largeDouble = 12345.6789;
        int truncatedInt = (int) largeDouble; // fractional part is lost
        System.out.println("double to int with loss of precision: " + truncatedInt);

        // Type Promotion in Expressions
        byte byteVal1 = 10;
        byte byteVal2 = 20;
        int result = byteVal1 + byteVal2; // byte is promoted to int in arithmetic operations
        System.out.println("\nType Promotion in Expressions:");
        System.out.println("byte + byte (promoted to int): " + result);

        // Mixing Data Types in Expressions
        int intNum = 50;
        double doubleNum = 25.5;
        double mixResult = intNum + doubleNum; // int is promoted to double
        System.out.println("int + double (promoted to double): " + mixResult);

        // Char Type Promotion
        char charVal = 'A'; // ASCII value of 'A' is 65
        int charPromotion = charVal + 1; // char is promoted to int
        System.out.println("\nChar Type Promotion:");
        System.out.println("char + int: " + charPromotion); // Result: 66 (65 + 1)

        // Casting in Expressions
        double divisionResult = (double) 5 / 2; // Cast one operand to double
        System.out.println("\nCasting in Expressions:");
        System.out.println("5 / 2 with casting to double: " + divisionResult);
    }
}
