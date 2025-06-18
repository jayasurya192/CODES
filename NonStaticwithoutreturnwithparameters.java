public class NonStaticwithoutreturnwithparameters {
    public void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
    public static void main(String[] args) {
NonStaticwithoutreturnwithparameters obj = new NonStaticwithoutreturnwithparameters();
        obj.greet("suryaa", 20);
    }
}
