import java.util.Scanner;
public class Stringoutofboundexp {
    public static void generateException(String text) {
        System.out.println("Generating exception...");
        System.out.println(text.charAt(text.length()));
    }
    public static void handleException(String text) {
        System.out.println("Handling exception safely...");
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index is out of bounds for the string.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
    }
}
