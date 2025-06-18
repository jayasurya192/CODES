public class GCDCalculator {
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Numbers must be non-negative.");
        }
        while (b != 0) {
            int temp = b; 
            b = a % b;   
            a = temp;    
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18; 
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}