import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        int temp=number;
        int count=0;
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        int[] digits=new int[count];
        int index=0;
        while(number!=0){
            digits[index]=number%10;
            number=number/10;
            index++;
        }
        int[] freq=new int[10];
        for(int i=0;i<count;i++){
            freq[digits[i]]++;
        }
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++){
            if(freq[i]>0){
                System.out.println(i+" -> "+freq[i]);
            }
        }
    }
}
