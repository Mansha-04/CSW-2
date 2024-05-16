import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String input = sc.nextLine();
        int result = convertStringToInteger(input);
        System.out.println("Converted integer : "+result);
        
    }

    public static int convertStringToInteger(String input) {
        Scanner sc = new Scanner(System.in);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println(e);
            System.out.println("Enter a number: ");
            String newInput = sc.nextLine();
            return convertStringToInteger(newInput);
        }
    }
}

