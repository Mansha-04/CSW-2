import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of x in radians : ");
            double x = sc.nextDouble();
            double result = calculate(x);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e);
        } 
    }

    public static double calculate(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double tanX = Math.tan(x);
        double cotX = 1.0 / tanX;   
        if((tanX - cotX) == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (Math.log(sinX + cosX))/(tanX - cotX);
    }
}
