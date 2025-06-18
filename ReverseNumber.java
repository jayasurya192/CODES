import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int reversed = reverse(num, 0);
        System.out.println("Reversed number is: " + reversed);
    }

    public static int reverse(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        reversed = reversed * 10 + num % 10;
        return reverse(num / 10, reversed);
    }
}
