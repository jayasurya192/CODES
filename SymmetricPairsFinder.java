import java.util.HashMap;

public class SymmetricPairsFinder {
    public static void findSymmetricPairs(int[][] pairs) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int[] pair : pairs) {
            int first = pair[0];
            int second = pair[1];
            map.put(first, second); 
        }
        System.out.println("Symmetric pairs in the array:");
        boolean found = false; 
        for (int[] pair : pairs) {
            int first = pair[0];
            int second = pair[1];
            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + first + ", " + second + ") and (" + second + ", " + first + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No symmetric pairs found.");
        }
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {1, 2},
            {2, 1},
            {3, 4},
            {4, 3},
            {5, 6},
            {7, 8}
        }; 

        findSymmetricPairs(pairs);
    }
}