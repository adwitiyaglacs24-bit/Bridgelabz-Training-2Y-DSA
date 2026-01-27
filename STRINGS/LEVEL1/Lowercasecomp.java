import java.util.Scanner;
public class Lowercasecomp {
    public static String toLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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
        String lowerBuiltIn = input.toLowerCase();
        String lowerManual = toLowerCaseManual(input);
        boolean isSame = compareStrings(lowerBuiltIn, lowerManual);
        System.out.println("Original text: " + input);
        System.out.println("Lowercase (built-in): " + lowerBuiltIn);
        System.out.println("Lowercase (manual): " + lowerManual);
        System.out.println("Are both lowercase results same? " + isSame);
    }
}
