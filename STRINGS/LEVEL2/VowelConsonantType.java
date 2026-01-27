import java.util.Scanner;
public class VowelConsonantType {
    static String checkChar(char ch){
        if(ch>='A' && ch<='Z'){
            ch=(char)(ch+32);
        }
        if(ch>='a' && ch<='z'){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return "Vowel";
            }else{
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    static String[][] findCharType(String text){
        int count=0;
        for(int i=0;;i++){
            try{
                text.charAt(i);
                count++;
            }catch(Exception e){
                break;
            }
        }
        String[][] result=new String[count][2];
        for(int i=0;i<count;i++){
            char ch=text.charAt(i);
            result[i][0]=String.valueOf(ch);
            result[i][1]=checkChar(ch);
        }
        return result;
    }
    static void display(String[][] data){
        System.out.println("\nCharacter\tType");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t\t"+data[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=sc.nextLine();
        String[][] output=findCharType(text);
        display(output);
    }
}
