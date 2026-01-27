import java.util.Scanner;
public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter number of persons: ");
        number=sc.nextInt();
        double[][] personData=new double[number][3];
        String[] weightStatus=new String[number];
        for(int i=0;i<number;i++){
            do{
                System.out.print("Enter weight (kg) of person "+(i+1)+": ");
                personData[i][0]=sc.nextDouble();
            }while(personData[i][0]<=0);
            do{
                System.out.print("Enter height (m) of person "+(i+1)+": ");
                personData[i][1]=sc.nextDouble();
            }while(personData[i][1]<=0);
        }
        for(int i=0;i<number;i++){
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
            if(personData[i][2]<=18.4){
                weightStatus[i]="Underweight";
            }else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){
                weightStatus[i]="Normal";
            }else if(personData[i][2]>=25.0 && personData[i][2]<=39.9){
                weightStatus[i]="Overweight";
            }else{
                weightStatus[i]="Obese";
            }
        }
        for(int i=0;i<number;i++){
            System.out.println(
                personData[i][1]+"\t"+
                personData[i][0]+"\t"+
                String.format("%.2f",personData[i][2])+"\t"+
                weightStatus[i]);
        }
    }
}
