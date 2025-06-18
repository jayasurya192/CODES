import java.util.Arrays;
public class MinimumScalarProduct {
    public static int minimumScalarProduct(int[] vectorA, int[] vectorB) {
        Arrays.sort(vectorA);
        Arrays.sort(vectorB);
        for (int i = 0; i < vectorB.length / 2; i++) {
            int temp = vectorB[i];
            vectorB[i] = vectorB[vectorB.length - 1 - i];
            vectorB[vectorB.length - 1 - i] = temp;
        }
        int scalarProduct = 0;
        for (int i = 0; i < vectorA.length; i++) {
            scalarProduct += vectorA[i] * vectorB[i];
        }

        return scalarProduct; 
    }

    public static void main(String[] args) {
        int[] vectorA = {1, 3, -5}; // Example vector A
        int[] vectorB = {4, -2, 2}; // Example vector B

        int result = minimumScalarProduct(vectorA, vectorB);
        System.out.println("Minimum scalar product: " + result);
    }
}