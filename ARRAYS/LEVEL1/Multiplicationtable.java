import java.util.Scanner;
public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        System.out.println("\n--- Multiplication Table ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
