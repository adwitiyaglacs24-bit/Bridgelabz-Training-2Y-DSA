import java.util.Scanner;
public class SplitText {
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
    static String[] customSplit(String text){
        int len=findLength(text);
        int wordCount=1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ')
                wordCount++;
        }
        int[] spaceIndex=new int[wordCount+1];
        spaceIndex[0]=-1;
        int idx=1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                spaceIndex[idx]=i;
                idx++;
            }
        }
        spaceIndex[idx]=len;
        String[] words=new String[wordCount];
        for(int i=0;i<wordCount;i++){
            String w="";
            for(int j=spaceIndex[i]+1;j<spaceIndex[i+1];j++){
                w=w+text.charAt(j);
            }
            words[i]=w;
        }
        return words;
    }
    static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length)
            return false;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        String[] customWords=customSplit(text);
        String[] builtInWords=text.split(" ");
        boolean result=compareArrays(customWords,builtInWords);
        System.out.println("Custom Split:");
        for(String w:customWords)
            System.out.println(w);
        System.out.println("Built-in Split:");
        for(String w:builtInWords)
            System.out.println(w);
        System.out.println("Both results are same: "+result);
    }
}
