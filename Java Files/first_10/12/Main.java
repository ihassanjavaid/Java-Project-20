import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Make Arrays
        int[] array1 = { 1, 2, 3, 6, 7, 8 };
        int[] array2 = { 1, 3, 3, 6, 8, 8, 7 };
        int[] array3 = { 7, 2, 9, 1, 2, 3, 6, 8, 9 };

        // Print true/false according to pattern
        System.out.println(arrayOneTwoThree(array1));
        System.out.println(arrayOneTwoThree(array2));
        System.out.println(arrayOneTwoThree(array3));

    }

    public static boolean arrayOneTwoThree(int[] array) {

        // Check the pattern
        // Try/Catch block have been put for a reason to avoid IndexOutOfBoundsException
        try{
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    if (array[i + 1] == 2) {
                        if (array[i + 2] == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        catch (Exception e){
            return false;
        }
        return false;
    }
}