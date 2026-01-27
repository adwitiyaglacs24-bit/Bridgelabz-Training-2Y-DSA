import java.util.Scanner;
public class CustomTrim {
    static int[] findTrimIndex(String s){
        int start=0;
        int end=0;
        for(int i=0;;i++){
            try{
                if(s.charAt(i)!=' '){
                    start=i;
                    break;
                }
            }catch(Exception e){
                break;
            }
        }
        for(int i=0;;i++){
            try{
                s.charAt(i);
                end=i;
            }catch(Exception e){
                break;
            }
        }
        for(int i=end;i>=0;i--){
            if(s.charAt(i)!=' '){
                end=i;
                break;
            }
        }
        return new int[]{start,end};
    }
    static String customSubstring(String s,int start,int end){
        String result="";
        for(int i=start;i<=end;i++){
            result=result+s.charAt(i);
        }
        return result;
    }
    static boolean compareStrings(String a,String b){
        int i=0;
        for(;;){
            try{
                if(a.charAt(i)!=b.charAt(i))
                    return false;
                i++;
            }catch(Exception e){
                break;
            }
        }
        try{
            b.charAt(i);
            return false;
        }catch(Exception e){
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=sc.nextLine();
        int[] index=findTrimIndex(text);
        String customTrimmed=customSubstring(text,index[0],index[1]);
        String builtInTrimmed=text.trim();
        boolean result=compareStrings(customTrimmed,builtInTrimmed);
        System.out.println("Custom Trimmed: ["+customTrimmed+"]");
        System.out.println("Built-in Trimmed: ["+builtInTrimmed+"]");
        System.out.println("Both strings are same: "+result);
    }
}
