import java.util.Arrays;

public class MaximumScalarProduct {
    public static int maximumScalarProduct(int[] vectorA, int[] vectorB) {
        Arrays.sort(vectorA);
        Arrays.sort(vectorB);
        int scalarProduct = 0;
        for (int i = 0; i < vectorA.length; i++) {
            scalarProduct += vectorA[i] * vectorB[i];
        }

        return scalarProduct; 
    }

    public static void main(String[] args) {
        int[] vectorA = {1, 3, -5}; // Example vector A
        int[] vectorB = {4, -2, 2}; // Example vector B

        int result = maximumScalarProduct(vectorA, vectorB);
        System.out.println("Maximum scalar product: " + result);
    }
}