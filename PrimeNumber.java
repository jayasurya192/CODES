import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (isPrime(num, 2)) {
            System.out.println(num +" is a prime number");
        } else {
            System.out.println(num +" is not a prime number");
        }
    }
    public static boolean isPrime(int num, int i) {
        if (num <= 2) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        return isPrime(num, i + 1);
    }
}