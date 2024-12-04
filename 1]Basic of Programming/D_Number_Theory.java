public class D_Number_Theory {

    public static void main(String[] args) {
        // Problem 1: Check if a number is a palindrome
        int num1 = 121;
        System.out.println("Is Palindrome: " + isPalindrome(num1)); // true

        // Problem 2: Check if a year is a leap year
        int year = 2024;
        System.out.println("Is Leap Year: " + isLeapYear(year)); // true

        // Problem 3: Find smallest and largest digits in a number
        int num2 = 59327;
        findSmallestAndLargestDigits(num2); // Smallest: 2, Largest: 9

        // Problem 4: Print Fibonacci series up to N terms
        int n = 10;
        System.out.print("Fibonacci Series: ");
        printFibonacci(n);

        // Problem 5: Print all prime factors of a number
        int num3 = 84;
        System.out.print("Prime Factors: ");
        printPrimeFactors(num3); // 2, 2, 3, 7

        // Problem 6: Find GCD of two numbers
        int n1 = 56, n2 = 98;
        System.out.println("GCD: " + findGCD(n1, n2)); // 14

        // Problem 7: Find LCM of two numbers
        System.out.println("LCM: " + findLCM(n1, n2)); // 392

        // Problem 8: Add two fractional numbers
        int num = 1, denom = 3, numB = 2, denomB = 5;
        addFractions(num, denom, numB, denomB); // Result: 11/15

        // Problem 9: Replace all zeros in a number with ones
        int num4 = 1050;
        System.out.println("Replaced Number: " + replaceZerosWithOnes(num4)); // 1151

        // Problem 10: Express a number as the sum of two prime numbers
        int num5 = 34;
        System.out.println("Sum of Two Primes: " + expressAsSumOfTwoPrimes(num5)); // 3 + 31

        // Problem 11: Check if two numbers are co-prime
        int a = 14, b = 15;
        System.out.println("Are Co-prime: " + areCoPrime(a, b)); // true

        // Problem 12: Find all divisors of a number
        int num6 = 28;
        System.out.print("Divisors: ");
        findAllDivisors(num6); // 1, 2, 4, 7, 14, 28

        // Problem 13: Factorial of a number
        int num7 = 5;
        System.out.println("Factorial: " + factorial(num7)); // 120
    }


// Problem 1: Check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }


// Problem 2: Check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


// Problem 3: Find smallest and largest digits in a number
    public static void findSmallestAndLargestDigits(int n) {
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        while (n > 0) {
            int digit = n % 10;
            smallest = Math.min(smallest, digit);
            largest = Math.max(largest, digit);
            n /= 10;
        }
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
    }


// Problem 4: Print Fibonacci series up to N terms
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }


// Problem 5: Print all prime factors of a number
    public static void printPrimeFactors(int n) {
    // Handle 2 separately to reduce the odd numbers in the loop
    while (n % 2 == 0) {
        System.out.print(2 + " ");
        n /= 2;
    }

    // Check odd numbers starting from 3 up to √n
    for (int i = 3; i * i <= n; i += 2) {
        while (n % i == 0) {
            System.out.print(i + " ");
            n /= i;
        }
    }

    // If n is a prime number greater than 2, print it
    if (n > 2) {
        System.out.print(n);
    }
    System.out.println();
}


// Problem 6: Find GCD of two numbers
    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }


// Problem 7: Find LCM of two numbers
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    
// Problem 8: Add two fractional numbers
    public static void addFractions(int numA, int denomA, int numB, int denomB) {
        int commonDenom = denomA * denomB;
        int numerator = (numA * denomB) + (numB * denomA);
        int gcd = findGCD(numerator, commonDenom);
        System.out.println("Result: " + (numerator / gcd) + "/" + (commonDenom / gcd));
    }


// Problem 9: Replace all zeros in a number with ones
    public static int replaceZerosWithOnes(int n) {
        int result = 0, place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) digit = 1;
            result += digit * place;
            place *= 10;
            n /= 10;
        }
        return result;
    }


// Problem 10: Express a number as the sum of two prime numbers
    public static String expressAsSumOfTwoPrimes(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                return i + " + " + (n - i);
            }
        }
        return "Not possible";
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


// Problem 11: Check if two numbers are co-prime
    public static boolean areCoPrime(int a, int b) {
        return findGCD(a, b) == 1;
    }


// Problem 12: Find all divisors of a number
    public static void findAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Problem 13: Factorial of a number
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
