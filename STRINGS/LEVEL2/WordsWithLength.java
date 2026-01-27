import java.util.Scanner;
public class WordsWithLength {
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
    static String[][] wordsWithLength(String[] words){
        String[][] result=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            result[i][0]=words[i];
            result[i][1]=String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        String[] words=customSplit(text);
        String[][] data=wordsWithLength(words);
        System.out.println("\nWord\tLength");
        for(int i=0;i<data.length;i++){
            System.out.println(
                data[i][0]+"\t"+
                Integer.parseInt(data[i][1]));
        }
    }
}
