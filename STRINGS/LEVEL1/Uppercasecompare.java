import java.util.Scanner;
public class Uppercasecompare {
    public static String toUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        String upperBuiltIn = input.toUpperCase();
        String upperManual = toUpperCaseManual(input);
        boolean isSame = compareStrings(upperBuiltIn, upperManual);
        System.out.println("Original text: " + input);
        System.out.println("Uppercase (built-in): " + upperBuiltIn);
        System.out.println("Uppercase (manual): " + upperManual);
        System.out.println("Are both uppercase results same? " + isSame);
    }
}
