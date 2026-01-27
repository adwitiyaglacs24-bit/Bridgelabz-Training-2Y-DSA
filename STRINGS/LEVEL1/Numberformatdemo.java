import java.util.Scanner;
public class Numberformatdemo {
    public static void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println("Number is: " + num);
    }
    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Number after parsing: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling exception!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }
        handleException(input);
    }
}
