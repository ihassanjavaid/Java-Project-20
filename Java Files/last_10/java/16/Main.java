import java.util.Scanner;

public class Main {

    public static void fizzbUZZ(int num1, int num2){
        if(num2>num1){
            int array_size_1=(num2-num1) + 1;
            int [] array1 = new int [array_size_1];
            String [] array2 = new String[array_size_1];
            for(int i=0;i<=array_size_1-1;i++){
                array1[i]=num1;
                num1+=1;
            }
            for (int j=0;j<=array_size_1-1;j++){
               if(array1[j]%3==0){
                    array2[j]="Fizz";
               }
               else if(array1[j]%5==0){
                   array2[j]="Buzz";
               }
               else {
                    array2[j]= String.valueOf(array1[j]);
               }
            }
            for (int k=0;k<=array_size_1-1;k++){
                System.out.print(array2[k]+",");
            }
        }
        else {
            System.out.println("Invalid entry number 1 should be greater than number 2");
        }



    }

public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int num1,num2;
    System.out.print("Enter number from where you want to start :");
    num1= input.nextInt();
    System.out.print("Enter number from where you want to end : ");
    num2 = input.nextInt();
    fizzbUZZ(num1,num2);


}
}
