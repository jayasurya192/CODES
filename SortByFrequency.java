import java.util.Arrays;
import java.util.Scanner;
public class SortByFrequency {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int size = scanner.nextInt();
int[] array = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
array[i] = scanner.nextInt();
}
sortByFrequency(array);
System.out.println("Sorted array by frequency:");
System.out.println(Arrays.toString(array));
}
public static void sortByFrequency(int[] array) {
int[] frequency = new int[array.length];
for (int i = 0; i < array.length; i++) {
frequency[i] = 0;
for (int j = 0; j < array.length; j++) {
if (array[i] == array[j]) {
frequency[i]++;
}
}
}
for (int i = 0; i < array.length - 1; i++) {
for (int j = i + 1; j < array.length; j++) {
if (frequency[i] > frequency[j]) {
int temp = array[i];
array[i] = array[j];
array[j] = temp;
temp = frequency[i];
frequency[i] =frequency[j];
frequency[j] =temp;
}
}
}
 }
}