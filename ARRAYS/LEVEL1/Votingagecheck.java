import java.util.Scanner;
public class Votingagecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }
        System.out.println("\n--- Voting Eligibility ---");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("The student with age " + ages[i] + " has entered an invalid age.");
            } 
            else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } 
            else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }
    }
}
