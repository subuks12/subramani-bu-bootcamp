import java.io.*; 
import java.util.ArrayList;
 
public class GradeAnalyzer {
    private static int invalidLines;
 
    public static void main(String[] args) {
        // Step 1: read scores from file
        ArrayList<Integer> scores = readScores("scores.txt");
        
        // Step 2: calculate statistics
        double avg = calculateAverage(scores);
        int high = scores.isEmpty() ? 0 : scores.get(0);
        int low = high;
        for (int score : scores) {
            high = Math.max(high, score);
            low = Math.min(low, score);
        }
        // Step 3: write and print report
        writeReport(scores, avg, high, low, "grade_report.txt");
        // Step 4: count grade bands
        countGradeBands(scores);
    } 
 
    // Returns a list of valid scores read from the file
    public static ArrayList<Integer> readScores(String filename) {
        ArrayList<Integer> scores = new ArrayList<>();
        invalidLines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int score = Integer.parseInt(line.trim());
                    if (score >= 0 && score <= 100) {
                        scores.add(score);
                    }
                } catch (NumberFormatException ignored) {
                    // count the blank lines and catch invalid scores count and report in   
                    if (!line.trim().isEmpty()) {
                        invalidLines++;
                    }           


                }
            }
        } catch (IOException e) {
            System.err.println("Unable to read " + filename + ": " + e.getMessage());
        }
        return scores;
    }
 
    // Returns the average of a list of scores, or 0.0 if the list is empty
    public static double calculateAverage(ArrayList<Integer> scores) {
        if (scores.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.size();
    } 
 
    // Writes and prints the report
    public static void writeReport(ArrayList<Integer> scores,
                                   double avg, int high, int low,
                                   String outputFile) {
        String report =  "===== Grade Analysis Report ====" + System.lineSeparator()
             +   "Total Scores Processed: " + scores.size() + System.lineSeparator()
            + "Invalid Lines Skipped: " + invalidLines + System.lineSeparator()
            //how to add a blank line in the report
            + System.lineSeparator()
                + "Average score: " + avg + System.lineSeparator()
                + "Highest score: " + high + System.lineSeparator()
                + "Lowest score: " + low
            + System.lineSeparator();    
        System.out.println(report);
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println(report);
        } catch (IOException e) {
            System.err.println("Unable to write " + outputFile + ": " + e.getMessage());
        }
    }
    //Class to count the grades
    public static void countGradeBands(ArrayList<Integer> scores) {
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        for (int score : scores) {
            if (score >= 90) {
                countA++;
            } else if (score >= 80) {
                countB++;
            } else if (score >= 70) {
                countC++;
            } else if (score >= 60) {
                countD++;
            } else {
                countF++;
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("A (90-100):   " + countA);
        System.out.println("B (80-89):    " + countB);
        System.out.println("C (70-79):    " + countC);
        System.out.println("D (60-69):    " + countD);
        System.out.println("F (below 60): " + countF);
    }

} 