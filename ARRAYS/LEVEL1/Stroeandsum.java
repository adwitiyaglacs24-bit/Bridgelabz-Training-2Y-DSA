import java.util.Scanner;
public class Stroeandsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10]; 
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            arr[index] = num;
            index++;
        }
        System.out.println("\n--- Numbers Entered ---");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }
        System.out.println("\nTotal sum = " + total);
    }
}
