public class withreturnwithoutparameters {
    public static void main(String[] args) {
        int result = getRandomNumber();
        System.out.println("Random Number: " + result);
    }
    public static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}