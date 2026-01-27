import java.util.Scanner;
public class StringLength {
    static int findLength(String s){
        int count=0;
        try{
            for(;;){
                s.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.next();
        int customLength=findLength(str);
        int builtInLength=str.length();
        System.out.println("Length without length(): "+customLength);
        System.out.println("Length using length(): "+builtInLength);
    }
}