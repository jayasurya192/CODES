public class NonStaticwithreturnwithoutparameters {
    public int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
    public static void main(String[] args) {
NonStaticwithreturnwithoutparameters obj = new NonStaticwithreturnwithoutparameters();
        int randomNumber = obj.getRandomNumber();
        System.out.println("Random Number: " + randomNumber);
    }
}