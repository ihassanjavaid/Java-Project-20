import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in binary form "); // take binary input
        String binary = input.nextLine();
        int binarynumber = Integer.parseInt(binary); // convert into integer form
        Conversion binary_num = new Conversion(); // make an object of class
        System.out.println("Decimal  : "+binary_num.BinaryToDecimal(binarynumber));  // pass the binary value to the Conversion clsaa

    }
}

class Conversion {
    public int BinaryToDecimal(int binaryNumber){
        int decimal = 0;
        int p = 0;
        while(true){
            if(binaryNumber == 0){
                break;
            } else {
                int temp = binaryNumber%10;
                decimal += temp*Math.pow(2, p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
        return decimal;
    }


}