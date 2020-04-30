import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Declarations
        Scanner input = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Enter number 1: ");
        a = input.nextInt();
        System.out.print("Enter number 2: ");
        b = input.nextInt();

        // Call function
        System.out.println("Sum: " + sortOfSum(a, b));
    }

    public static int sortOfSum(int a, int b) {
        // Return 20 if sum is from 10 to 19
        if ((a + b) <= 19 && (a + b) >= 10)
            return 20;
        // Otherwise return the actual sum
        return a + b;
    }
}