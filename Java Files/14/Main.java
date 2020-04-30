import java.util.Scanner;

public class Main {

    public static void firstOrLastCharacter(String s){
        if(s.length()<4){
            int total = s.length()-1    ;
            System.out.println(s.charAt(total));
        }
        else {
            System.out.println(s.charAt(0));
        }
    }


    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Enter a string");
        word = input.nextLine();
        firstOrLastCharacter(word);

    }
}
