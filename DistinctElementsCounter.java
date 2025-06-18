import java.util.HashSet;

public class DistinctElementsCounter {
    public static int countDistinct(int[] array) {
        HashSet<Integer> distinctElements = new HashSet<>(); 
        for (int num : array) {
            distinctElements.add(num);
        }
        return distinctElements.size();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 1}; 
        int distinctCount = countDistinct(array);
        System.out.println("Number of distinct elements: " + distinctCount);
    }
}