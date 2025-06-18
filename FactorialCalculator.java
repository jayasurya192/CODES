public class FactorialCalculator {
    public static long factorialRecursive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (number == 0 || number == 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        }
        return number * factorialRecursive(number - 1); 
    }

    public static void main(String[] args) {
        int testNumber = 5; 
        long factorial = factorialRecursive(testNumber);
        System.out.println("Factorial of " + testNumber + " is: " + factorial);
    }
}