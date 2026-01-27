import java.util.Scanner;
public class Chararraycomp {
    public static char[] manualToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manualArray = manualToCharArray(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareCharArrays(manualArray, builtInArray);
        System.out.println("\nManual char array:");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }
        System.out.println("\nBuilt-in char array:");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        if (result) {
            System.out.println("\n\nBoth methods produce the SAME character array.");
        } else {
            System.out.println("\n\nBoth methods produce DIFFERENT character arrays.");
        }
    }
}
