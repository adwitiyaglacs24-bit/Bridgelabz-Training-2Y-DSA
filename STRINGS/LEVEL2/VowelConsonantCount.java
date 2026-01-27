import java.util.Scanner;
public class VowelConsonantCount {
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
        return "NotALetter";
    }
    static int[] findVowelsAndConsonants(String s){
        int vowels=0;
        int consonants=0;
        for(int i=0;;i++){
            try{
                char ch=s.charAt(i);
                String result=checkChar(ch);
                if(result.equals("Vowel"))
                    vowels++;
                else if(result.equals("Consonant"))
                    consonants++;
            }catch(Exception e){
                break;
            }
        }
        return new int[]{vowels,consonants};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=sc.nextLine();
        int[] count=findVowelsAndConsonants(text);
        System.out.println("Vowels count: "+count[0]);
        System.out.println("Consonants count: "+count[1]);
    }
}
