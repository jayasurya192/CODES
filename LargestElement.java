import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = largest(array, 0, array[0]);
        System.out.println("Largest element in the array is: " + max);
    }

    public static int largest(int[] array, int index, int max) {
        if (index == array.length - 1) {
            return max;
        }
        if (array[index + 1] > max) {
            max = array[index + 1];
        }
        return largest(array, index + 1, max);
    }
}