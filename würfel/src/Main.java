import java.lang.Math;
import java.util.Scanner;


public class Main {
    // Globale Variablen
    static int zufall;
    static Scanner sc = new Scanner(System.in);
    static boolean nochmal = true;

    public static void Wuerfel() {
        zufall = (int) Math.round(Math.random() * 5 + 1);

        if (zufall == 3) {
            System.out.println("Sie haben gewonnen! Glückwunsch! Du hast eine " + zufall + " gewürfelt!");

        } else if (zufall > 3) {
            System.out.println("Probieren Sie es nochmal! Du hast eine " + zufall + " gewürfelt!");
        } else if (zufall < 3) {

            System.out.println("Verloren! Du hast eine " + zufall + " gewürfelt!");

        } else {
            System.out.println();
        }

    }

    public static void nochmal() {
        System.out.print("Nochmal? ");
        if(sc.nextLine().equalsIgnoreCase("nein")) {
            nochmal = false;
        }
    }


    public static void main(String[] args) {
        // Alles was hier ist, wird ausgeführt
        while(nochmal) {
            Wuerfel();
            nochmal();
        }

    }
}
