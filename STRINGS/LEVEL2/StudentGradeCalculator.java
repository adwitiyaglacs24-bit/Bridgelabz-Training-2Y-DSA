import java.util.Random;
public class StudentGradeCalculator {
    private static final Random random = new Random();
    public static int[][] generatePCMScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(100);  
            }
        }
        return scores;
    }
    public static Object[][] calculateTotalAvgPerc(int[][] pcmScores) {
        int numStudents = pcmScores.length;
        Object[][] results = new Object[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            int total = pcmScores[i][0] + pcmScores[i][1] + pcmScores[i][2];
            double avg = total / 3.0;
            double perc = Math.round(avg * 100.0) / 100.0; 
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = perc;
        }
        return results;
    }
    public static char[][] calculateGrades(Object[][] totalAvgPerc) {
        int numStudents = totalAvgPerc.length;
        char[][] grades = new char[numStudents][1];
        for (int i = 0; i < numStudents; i++) {
            double perc = (Double) totalAvgPerc[i][2];
            if (perc >= 80) {
                grades[i][0] = 'A';
            } else if (perc >= 70) {
                grades[i][0] = 'B'; 
            } else if (perc >= 50) {
                grades[i][0] = 'C'; 
            } else if (perc >= 40) {
                grades[i][0] = 'D';  
            } else {
                grades[i][0] = 'R';  
            }
        }
        return grades;
    }
    public static void displayScorecard(int[][] pcmScores, Object[][] totalAvgPerc, char[][] grades) {
        int numStudents = pcmScores.length;
        System.out.printf("%-5s %8s %10s %6s %8s %10s %12s %8s%n",
            "S.No", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-5d %8d %10d %6d %8d %10.2f %12.2f %8c%n",
                (i + 1),
                pcmScores[i][0], pcmScores[i][1], pcmScores[i][2],
                (Integer) totalAvgPerc[i][0],
                (Double) totalAvgPerc[i][1],
                (Double) totalAvgPerc[i][2],
                grades[i][0]);
        }
    }
    public static void main(String[] args) {
        int numStudents = 5; 
        int[][] pcmScores = generatePCMScores(numStudents);
        Object[][] totals = calculateTotalAvgPerc(pcmScores);
        char[][] grades = calculateGrades(totals);
        displayScorecard(pcmScores, totals, grades);
    }
}
