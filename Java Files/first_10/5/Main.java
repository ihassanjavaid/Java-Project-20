import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Declarations
        Scanner input = new Scanner(System.in);
        int decimal;

        System.out.println("Enter number in decimal: ");
        decimal = input.nextInt();

        convertToBinary(decimal);
    }

    public static void convertToBinary(int decimal) {

        int binary[] = new int[40];

        int index = 0;

        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

        System.out.println();
    }

}