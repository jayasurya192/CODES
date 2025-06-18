import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base:");
        int base = scanner.nextInt();
        System.out.println("Enter exponent:");
        int exponent = scanner.nextInt();
        int result = power(base, exponent);
        System.out.println(base + " power of " + exponent + " is: " + result);
    }
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}