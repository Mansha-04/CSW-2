import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the dividend: ");
            int a = sc.nextInt();

            System.out.println("Enter the divisor: ");
            int b = sc.nextInt();

            double result = divide(a, b);
            System.out.println("Result of division : "+result);
        } catch(ArithmeticException e) {
            System.err.println(e);
        }
    }

    public static double divide(int dividend, int divisor) {
        if(divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) dividend / divisor;
    }
}
