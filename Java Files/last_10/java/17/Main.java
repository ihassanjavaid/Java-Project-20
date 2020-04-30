import java.util.Scanner;

public class Main {

    public static void main (String []args){

        Scanner input = new Scanner(System.in);
        int num1, num2,result;
        System.out.println("Enter first number");
        num1=input.nextInt();
        System.out.println("Enter second number");
        num2= input.nextInt();

        if(num1<num2){
            result=num1+38;
            System.out.println(num1+ "+ 38 = "+ result);
        }
        else {
            result = num2-38;
            System.out.println(num2+ "- 38 = "+ result);
        }


    }
}
