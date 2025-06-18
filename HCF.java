import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        int hcf = findHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
    public static int findHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findHCF(num2, num1 % num2);
    }
}
