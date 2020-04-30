import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declare
        int integer;

        int firstDigit;
        int secondDigit;
        int thirdDigit;

        System.out.print("Enter integer: ");
        integer = input.nextInt();

        // Check integer is positive
        if ( integer < 0 ){
            System.out.println("Sorry integer is negative! Try Again");
            System.exit(0);
        }

        // check the length is 3
        if (Integer.toString(integer).length() != 3 ){
            System.out.println("Sorry! length must be 3 digits.");
            System.exit(0);
        }

        firstDigit = Integer.parseInt( String.valueOf(Integer.toString(integer).charAt(0)) );
        System.out.println("First digit: "+ firstDigit);

        secondDigit = Integer.parseInt( String.valueOf(Integer.toString(integer).charAt(1)) );
        System.out.println("Second digit: "+ secondDigit);

        thirdDigit = Integer.parseInt( String.valueOf(Integer.toString(integer).charAt(2)) );
        System.out.println("Third digit: "+ thirdDigit);

        // check if sum of first 2 greater than third
        if ( (firstDigit+secondDigit) > thirdDigit ){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}