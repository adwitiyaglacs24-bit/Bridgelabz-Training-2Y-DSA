import java.util.*;
public class Illegalargdemo {
    public static void generateException(String str) {
        System.out.println("Substring without handling: " + str.substring(5, 2));
    }
    public static void handleException(String str) {
        try {
            System.out.println("Substring with handling: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
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
