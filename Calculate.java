import java.util.Scanner;

class Add {
    Add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}
class Sub{
    Sub(int a, int b){
        System.out.println("Subtraction = " + (a - b));
    }
}
class Mul{
    Mul(int a, int b){
        System.out.println("Multiplication = " + (a * b));
    }
}
class Div {
    Div(int a, int b) {
        if (b != 0) {
            System.out.println("Division = " + ((double) a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Calculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Add obj1 = new Add(a, b);
        Sub obj2 = new Sub(a, b);
        Mul obj3 = new Mul(a, b);
        Div obj4 = new Div(a, b);

        sc.close();
    }
}