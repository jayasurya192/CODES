import java.util.HashMap;

public class NonRepeatingElementsFinder {
    public static void findNonRepeatingElements(int[] array) {
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int num : array) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        System.out.println("Non-repeating elements in the array:");
        boolean hasNonRepeating = false; 
        for (HashMap.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == 1) { 
                System.out.println(entry.getKey());
                hasNonRepeating = true;
            }
        }

        if (!hasNonRepeating) {
            System.out.println("No non-repeating elements found.");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 1}; // Example array
        findNonRepeatingElements(array);
    }
}