import java.util.Scanner;

public class Main{
public static void main(String[]args){
        Scanner input = new Scanner(System.in);  // initialize  scanner
        int [] array = new int [7];
        int count=0;

        for(int i=0;i<=6;i++){
        // take and store input in an array
        System.out.println("Enter number ");
        array[i] = input.nextInt();
        }

    for(int j=0;j<=6;j++){
        if(array[j]==9){
            count+=1;
        }
    }
        System.out.println("Total number of 9's  : " + count);





 }
}


