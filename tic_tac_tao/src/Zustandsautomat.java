import java.util.Scanner;

public class Zustandsautomat {
    public static void main(String[] args) {

        int zustand = 0;

        Scanner sc = new Scanner(System.in);



        while (zustand < 4) {
            switch (zustand) {
                case 0:
                    System.out.println("Willkommen bei unserem ersten Zustandsautomaten");
                    zustand = 1;
                    break;
                case 1:
                    System.out.println("Drücke 1 fur nochmal, 2 um es zu beenden: ");
                    zustand = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Programm wurde beendet");
                    zustand = 10;
                    break;

            }
        }


    }


}
