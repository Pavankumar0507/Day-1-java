import java.util.Scanner;

class no1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();25
        if (a >= b && a >= c)
            System.out.println("Biggest = " + a);
        else if (b >= a && b >= c)
            System.out.println("Biggest = " + b);
        else
            System.out.println("Biggest = " + c);
        if (a <= b && a <= c)
            System.out.println("Smallest = " + a);
        else if (b <= a && b <= c)
            System.out.println("Smallest = " + b);
        else
            System.out.println("Smallest = " + c);
        sc.close();
    }
}
    