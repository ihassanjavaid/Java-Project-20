import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        // Declarations
        Scanner input = new Scanner(System.in);
        int you;
        int date;

        System.out.print("Enter you: ");
        you = input.nextInt();

        System.out.print("Enter date: ");
        date = input.nextInt();

        // Get Result
        System.out.println(dateFashion(you, date));
        
    }

    public static int dateFashion(int you, int date){
        /*
        0 = No
        1 = Maybe
        2 = Yes
        */

        // Both are stylish
        if ( you >= 8 && date >= 8){
            return 2;
        }

        // Both not stylish
        if ( you <= 2 && date <=  2){
            return 0;
        }

        // Maybe
        return 1;
    }
}

