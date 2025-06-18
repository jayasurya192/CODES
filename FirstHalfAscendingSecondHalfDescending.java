import java.util.Arrays;
import java.util.Scanner;
public class FirstHalfAscendingSecondHalfDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        sortArray(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
    public static void sortArray(int[] array) {
        int mid = array.length / 2;
        Arrays.sort(array, 0, mid);
        reverseArray(array, mid, array.length - 1);
    }
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}