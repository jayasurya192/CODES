import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static int findLCM(int num1, int num2) {
        return (num1 * num2) / findHCF(num1, num2);
    }
    public static int findHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findHCF(num2, num1 % num2);
    }
}