import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Declarations
        Scanner input = new Scanner(System.in);
        int speed;
        int bDayInt;
        boolean isBirthday;

        // input
        System.out.print("Enter speed: ");
        speed = input.nextInt();

        System.out.print("Enter 1 if birthday, else Enter 0: ");
        bDayInt = input.nextInt();

        if (bDayInt == 1)
            isBirthday = true;
        else 
            isBirthday = false;

        System.out.println(caughtSpeeding(speed, isBirthday));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        // If it's not birthday
        if (!isBirthday) {
            if (speed <= 60)
                return 0;
            if (speed <= 80)
                return 1;
            return 2;
        }

        else {
            if (speed <= 65)
                return 0;
            if (speed <= 85)
                return 1;
            return 2;
        }

    }
}