public class E_Number_Conversion {

    public static void main(String[] args) {
        // Test all conversions
        System.out.println("Binary to Decimal: " + binaryToDecimal(1010)); // 10
        System.out.println("Binary to Octal: " + binaryToOctal(1010)); // 12
        System.out.println("Decimal to Binary: " + decimalToBinary(10)); // 1010
        System.out.println("Decimal to Octal: " + decimalToOctal(10)); // 12
        System.out.println("Octal to Binary: " + octalToBinary(12)); // 1010
        System.out.println("Octal to Decimal: " + octalToDecimal(12)); // 10
        System.out.print("Number to Words: ");
        numberToWords(123); // One Two Three
    }


// 1. Binary to Decimal
    public static int binaryToDecimal(int binary) {
        int decimal = 0, power = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        return decimal;
    }
    /*
     * Example:
     * Binary: 1010
     * Calculation: 1*(2^3) + 0*(2^2) + 1*(2^1) + 0*(2^0) = 8 + 0 + 2 + 0 = 10
     * Result: 10
     */



// 2. Binary to Octal
    public static int binaryToOctal(int binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToOctal(decimal);
    }
    /*
     * Example:
     * Binary: 1010
     * Step 1: Binary to Decimal: 1010 -> 10
     * Step 2: Decimal to Octal: 10 -> 12
     * Result: 12
     */


// 3. Decimal to Binary
    public static int decimalToBinary(int decimal) {
        int binary = 0, power = 1;
        while (decimal > 0) {
            binary += (decimal % 2) * power;
            decimal /= 2;
            power *= 10;
        }
        return binary;
    }
    /*
     * Example:
     * Decimal: 10
     * Calculation: 10 / 2 = 5 remainder 0, 5 / 2 = 2 remainder 1, 2 / 2 = 1 remainder 0, 1 / 2 = 0 remainder 1
     * Binary: Read remainders in reverse: 1010
     * Result: 1010
     */



// 4. Decimal to Octal
    public static int decimalToOctal(int decimal) {
        int octal = 0, power = 1;
        while (decimal > 0) {
            octal += (decimal % 8) * power;
            decimal /= 8;
            power *= 10;
        }
        return octal;
    }
    /*
     * Example:
     * Decimal: 10
     * Calculation: 10 / 8 = 1 remainder 2, 1 / 8 = 0 remainder 1
     * Octal: Read remainders in reverse: 12
     * Result: 12
     */



// 5. Octal to Binary
    public static int octalToBinary(int octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinary(decimal);
    }
    /*
     * Example:
     * Octal: 12
     * Step 1: Octal to Decimal: 1*(8^1) + 2*(8^0) = 8 + 2 = 10
     * Step 2: Decimal to Binary: 10 -> 1010
     * Result: 1010
     */



// 6. Octal to Decimal
    public static int octalToDecimal(int octal) {
        int decimal = 0, power = 0;
        while (octal > 0) {
            decimal += (octal % 10) * Math.pow(8, power);
            octal /= 10;
            power++;
        }
        return decimal;
    }
    /*
     * Example:
     * Octal: 12
     * Calculation: 1*(8^1) + 2*(8^0) = 8 + 2 = 10
     * Result: 10
     */



// 7. Number to Words
    public static void numberToWords(int number) {
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        if (number == 0) {
            System.out.print("Zero");
            return;
        }
        printWords(number, words);
        System.out.println();
    }

    private static void printWords(int number, String[] words) {
        if (number == 0) return;
        printWords(number / 10, words);
        System.out.print(words[number % 10] + " ");
    }
    /*
     * Example:
     * Number: 123
     * Digits: 1, 2, 3
     * Words: One Two Three
     * Result: One Two Three
     */
}
