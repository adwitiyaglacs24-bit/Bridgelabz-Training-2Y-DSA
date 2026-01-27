import java.util.Random;
import java.util.Scanner;
public class VotingEligibility {
    static int[] generateAges(int n){
        Random r=new Random();
        int[] ages=new int[n];
        for(int i=0;i<n;i++){
            ages[i]=r.nextInt(90)+10;
        }
        return ages;
    }
    static String[][] checkVoting(int[] ages){
        String[][] result=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            result[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0){
                result[i][1]="false";
            }else if(ages[i]>=18){
                result[i][1]="true";
            }else{
                result[i][1]="false";
            }
        }
        return result;
    }
    static void display(String[][] data){
        System.out.println("\nAge\tCan Vote");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+data[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] ages=generateAges(n);
        String[][] result=checkVoting(ages);
        display(result);
    }
}
