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

        System.out.println("Sum: " + sortOfSum(a, b));
    }

    public static int sortOfSum(int a, int b) {
        if ((a + b) <= 19 && (a + b) >= 10)
            return 20;
        return a + b;
    }
}