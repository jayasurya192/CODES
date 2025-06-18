public class withreturntypewithparameters {
    public static void main(String[] args) {
        int result = addNumbers(65, 23);
        System.out.println("Sum: " + result);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}