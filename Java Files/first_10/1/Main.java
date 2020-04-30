import java.text.DecimalFormat;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        // Make input
        Scanner input = new Scanner(System.in);

        // Declare scores
        double score1;
        double score2;
        double score3;
        double averageScore;

        // Get input from user and store it
        System.out.print("Enter score of Assignment 1: ");
        score1 = input.nextDouble();
        System.out.print("Enter score of Assignment 2: ");
        score2 = input.nextDouble();
        System.out.print("Enter score of Assignment 3: ");
        score3 = input.nextDouble();

        // Calculate average score
        averageScore = (score1 + score2 + score3) / 3;

        // Format to 2 decimal places
        DecimalFormat twoDecimalPlaces = new DecimalFormat("##.00");
        System.out.println("Average Score: " +twoDecimalPlaces.format(averageScore));


    }
}