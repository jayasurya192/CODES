public class PowerCalculator {
    public static double powerIterative(double base, int exponent) {
        double result = 1.0; // Initialize result
        int exp = Math.abs(exponent);
        for (int i = 0; i < exp; i++) {
            result *= base; 
        }
        if (exponent < 0) {
            return 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        double base = 2; 
        int exponent = -3; 
        double result = powerIterative(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}