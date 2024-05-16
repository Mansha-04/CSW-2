import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        try {
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("Entered num : "+num);
        } catch (NumberFormatException e) {
            System.err.println(e);
        } 
    }
}

