import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Declarations
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter number: ");
        num = input.nextInt();

        System.out.println(specialEleven(num));
    }

    public static boolean specialEleven(int num) {

        if (num % 11 == 0 || (num - 1) % 11 == 0)
            return true;
        return false;
    }
}