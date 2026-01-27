import java.util.Scanner;
public class RockPaperScissors {
    static String getComputerChoice(){
        int choice=(int)(Math.random()*3);
        if(choice==0)
            return "rock";
        else if(choice==1)
            return "paper";
        else
            return "scissors";
    }
    static String findWinner(String user,String computer){
        if(user.equals(computer))
            return "Draw";
        if(user.equals("rock") && computer.equals("scissors"))
            return "User";
        if(user.equals("rock") && computer.equals("paper"))
            return "Computer";
        if(user.equals("paper") && computer.equals("rock"))
            return "User";
        if(user.equals("paper") && computer.equals("scissors"))
            return "Computer";
        if(user.equals("scissors") && computer.equals("paper"))
            return "User";
        if(user.equals("scissors") && computer.equals("rock"))
            return "Computer";

        return "Invalid";
    }
    static String[][] calculateStats(int userWins,int compWins,int totalGames){
        String[][] stats=new String[2][3];
        double userPercent=(userWins*100.0)/totalGames;
        double compPercent=(compWins*100.0)/totalGames;
        stats[0][0]="User";
        stats[0][1]=String.valueOf(userWins);
        stats[0][2]=String.format("%.2f",userPercent);
        stats[1][0]="Computer";
        stats[1][1]=String.valueOf(compWins);
        stats[1][2]=String.format("%.2f",compPercent);

        return stats;
    }
    static void displayResults(String[][] games,String[][] stats){
        System.out.println("\nGame\tUser\tComputer\tWinner");
        for(int i=0;i<games.length;i++){
            System.out.println(
                (i+1)+"\t"+
                games[i][0]+"\t"+
                games[i][1]+"\t\t"+
                games[i][2]
            );
        }
        System.out.println("\nPlayer\tWins\tWin %");
        for(int i=0;i<stats.length;i++){
            System.out.println(
                stats[i][0]+"\t"+
                stats[i][1]+"\t"+
                stats[i][2]
            );
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        String[][] games=new String[n][3];
        int userWins=0;
        int compWins=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user=sc.next().toLowerCase();
            String computer=getComputerChoice();
            String winner=findWinner(user,computer);
            games[i][0]=user;
            games[i][1]=computer;
            games[i][2]=winner;
            if(winner.equals("User"))
                userWins++;
            else if(winner.equals("Computer"))
                compWins++;
        }
        String[][] stats=calculateStats(userWins,compWins,n);
        displayResults(games,stats);
    }
}
