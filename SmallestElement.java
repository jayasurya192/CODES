import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i<size; i++) {
            array[i] = scanner.nextInt();
        }
        int min = smallest(array,0,array[0]);
        System.out.println("Smallest element in the array is:" + min);
    }

    public static int smallest(int[] array,int index,int min) {
        if (index == array.length - 1) {
            return min;
        }
        if (array[index + 1] < min) {
            min = array[index + 1];
        }
        return smallest(array, index + 1, min);
    }
}