import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // initialize  scanner
        int [] number = new int [7];  // initialize array for 7 numbers
        int positive=1;
        int negitive=1;
        System.out.println("Enter 7 numbers");
        for(int i=0;i<=6;i++){
            // take and store input in an array
            System.out.println("Enter number ");
            number[i] = input.nextInt();
        }

        // product of positive numbers with positive and vice versa
        for (int j=0;j<=6;j++){
            if(number[j]>=0){
                positive = number[j] * positive;
            }
            else {
                negitive = number[j] * negitive;
            }
        }
        System.out.println("Product of non negative = "+positive);
        System.out.println(" ");
        System.out.println("Product of negative = "+negitive);






    }
}
