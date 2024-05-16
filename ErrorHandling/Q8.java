import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int number = sc.nextInt();
        try {
            double sqRoot = calculateSquareRoot(number);
            System.out.println(sqRoot);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        sc.close();
    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number!");
        }
        return Math.sqrt(number);
    }
}
