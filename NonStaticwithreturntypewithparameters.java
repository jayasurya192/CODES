public class NonStaticwithreturntypewithparameters {
public int addNumbers(int num1, int num2) {
return num1 + num2;
}
public static void main(String[] args) {
NonStaticwithreturntypewithparameters obj = new NonStaticwithreturntypewithparameters();
int sum = obj.addNumbers(88,67);
System.out.println("Sum: " + sum);
    }
}
