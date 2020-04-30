public class Main {

    public static void main (String[]args){
        // allocating strings to the variables
        String a= "hello";
        String b = "there";

        repeatSeparator("hello","there",3); // passing values to the method
    }

    public static void repeatSeparator(String s1, String s2, int count){
        int i =1;
        while ( i <= count){
            System.out.print(s1);
            i++;
            if(i<count){
                System.out.print(s2);
            }
            else{
                break;
            }
        }
    }
}
