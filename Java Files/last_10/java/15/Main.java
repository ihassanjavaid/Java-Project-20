import java.util.Scanner;

public class Main {

    public static void doCalculation(double n1, double n2, char c){

        double result;

        if(c == '*'){
            result = n1*n2;
            result = (double)Math.round(result*100)/100;
            System.out.println("The value of calculation is "+ result);
        }
        else if(c=='+'){
            result = n1+n2;
            result = (double)Math.round(result*100)/100;
            System.out.println("The value of calculation is "+ result);

        }
        else if(c=='-'){
            result = n1-n2;
            result = (double)Math.round(result*100)/100;
            System.out.println("The value of calculation is "+ result);

        }
        else if(c=='/'){
            result = n1/n2;
            result = (double)Math.round(result*100)/100;
            System.out.println("The value of calculation is "+ result);


        }

    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double num1,num2;
        char operator;
        System.out.print("Enter first number : ");
        num1 = input.nextDouble();
        System.out.print("Enter second number : ");
        num2 = input.nextDouble();
        System.out.print("Enter operation character : ");
        operator = input.next().charAt(0);

        doCalculation(num1,num2,operator);

    }

}
