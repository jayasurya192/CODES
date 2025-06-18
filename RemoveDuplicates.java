import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>(); 
        for (int num : array) {
            uniqueElements.add(num);
        }
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num; 
        }

        return resultArray; 
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 1}; 
        int[] resultArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
    }
}