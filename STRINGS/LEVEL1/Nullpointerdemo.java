public class Nullpointerdemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot call methods on a null object.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException without handling:");
        System.out.println("\nDemonstrating NullPointerException with handling:");
        handleException();
    }
}
