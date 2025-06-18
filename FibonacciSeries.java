public class FibonacciSeries {
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + terms + " terms: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " "); // Print the current term
            int next = first + second;
            first = second; 
            second = next;  
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        int numberOfTerms = 10; 
        generateFibonacci(numberOfTerms);
    }
}