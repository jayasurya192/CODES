import java.util.Scanner;
public class FrequencyOfElements {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int size = scanner.nextInt();
int[] array = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
array[i] = scanner.nextInt();
}
findFrequency(array);
}
public static void findFrequency(int[] array) {
for (int i = 0; i < array.length; i++) {
boolean isFound = false;
for (int j = 0; j < i; j++) {
if (array[i] == array[j]) {
isFound = true;
break;
}
}
if (!isFound) {
int frequency = 0;
for (int j = 0; j < array.length; j++) {
if (array[i] == array[j]) {
frequency++;
}
}
System.out.println("Frequency of " + array[i] + ": " + frequency);
}
}
}
}

