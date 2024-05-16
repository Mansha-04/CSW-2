import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of x in radians : ");
            double x = sc.nextDouble();
            double result = calculate(x);
            System.out.println(result);
        } catch(Exception e) {
            System.err.println(e);
        } 
    }

    public static double calculate(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double tanX = Math.tan(x);
        if (Math.abs(tanX) < 1e-10) {
            throw new ArithmeticException("error");
        }
        return (sinX + cosX) / tanX;
    }
}
