import java.util.Scanner;
public class numbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } 
            else if (num < 0) {
                System.out.println(num + " is Negative.");
            } 
            else {
                System.out.println(num + " is Zero.");
            }
        }
        System.out.println("\n--- Comparing First and Last Element ---");
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal.");
        } 
        else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than last element.");
        } 
        else {
            System.out.println("First element is Less than last element.");
        }
    }
}
