import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        double num;
        int type;
        boolean imperial;

        System.out.print("Enter number: ");
        num = input.nextDouble();

        System.out.print("Enter 1 if it's in imperial else Enter 0: ");
        type = input.nextInt();

        if ( type == 1 ){
            imperial = true;
        }
        else {
            imperial = false;
        }

        double finalNum = convert(num, imperial);
        System.out.println("converted number is: " +finalNum);
    }

    public static double convert(double number, boolean toMetric){
        double numberConverted;
        
        if (toMetric){
            // Convert to metric (mm)
            numberConverted = number*25.4;
        }
        else {
            // Convert to imperial (inch)
            numberConverted = number/25.4;
        }

        return numberConverted;
    }
}