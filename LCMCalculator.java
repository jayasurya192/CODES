public class LCMCalculator {
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Numbers must be non-negative.");
        }
        while (b != 0) {
            int temp = b; 
            b = a % b;   
            a = temp;     
        }
        return a; // When b is 0, a contains the GCD
    }
    public static int lcm(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Numbers must be non-negative.");
        }
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15; 
        int result = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
    }
}