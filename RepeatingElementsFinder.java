import java.util.HashMap;

public class RepeatingElementsFinder {
    public static void findRepeatingElements(int[] array) {
        HashMap<Integer, Integer> elementCount = new HashMap<>(); 
        for (int num : array) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        System.out.println("Repeating elements in the array:");
        boolean hasRepeating = false; 
        for (HashMap.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() > 1) { // If count is greater than 1, it's a repeating element
                System.out.println(entry.getKey() + " (repeats " + entry.getValue() + " times)");
                hasRepeating = true;
            }
        }

        if (!hasRepeating) {
            System.out.println("No repeating elements found.");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 1}; 
        findRepeatingElements(array);
    }
}