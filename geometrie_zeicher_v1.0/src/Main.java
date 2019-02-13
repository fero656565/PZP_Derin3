import java.util.Scanner;

public class Main {
    static int laenge;
    static int breite;
    static Scanner derScanner = new Scanner(System.in);


    public static void lesen_laenge_breite() {
        Scanner derScanner = new Scanner(System.in);
        System.out.print("Geben Sie die Länge ein: ");
        laenge = derScanner.nextInt();
        System.out.print("Geben Sie die Breite ein: ");
        breite = derScanner.nextInt();
        System.out.println();
    }

    public static void zeichne_rechteck_gefuellt() {
        // 2. Gefülltes Rechteck
        for (int i = 1; i <= laenge; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void zeichne_rechteck_ungefuellt() {

        // 3. Ungefülltes Rechteck
        // Erste Zeile

        System.out.print("Geben Sie die Rahmenstärke an: ");
        int rahmen = derScanner.nextInt();
        System.out.println(" ");

        for (int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // 2. - vorletzte Zeile
        for (int i = 1; i <= laenge - rahmen * 2; i++) {
            // Rahmen Teil 1 - Teil vor der Aussparung
            for (int k = 1; k <= rahmen; k++) {
                System.out.print("#");
            }
            // Aussparung
            for (int j = 1; j <= breite - 2 * rahmen; j++) {
                System.out.print(" ");
            }
            // Rahemen Teil 2 - Teil nach der Aussparung
            for (int k = 1; k <= rahmen; k++) {
                System.out.print("#");
            }
            // Zeilenumbruch am Ende der Zeile
            System.out.println();
        }
        // Letzte Zeile
        for (int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void willkommen() {
        System.out.println("\n" + "Willkommen beim Geometriezeichner V2.0!" + "\n");
    }

    public static void rechteck_zeichnen() {
        // 1. lesen breite und laenge
        // Scanner einbinden
        // Zwei Zahlen einlesen und als laenge und breite abspeichern


        // Schleifen - For Schleife
        // Schleifenkopf:   1. Teil:    Zählvariable und Startwert
        //                  2. Teil:    Grenze (Möglich sind hier alle Operatoren)
        //                              <, <=, >, >=, ==, !=
        //                  3. Teil:    Anweisung nach einem Durchlauf
        //                              i++: Erhöhe um eines
        //                              i--: Erniedrige um eins


    }

    public static void beende() {
        System.out.println("Geometriezeichner V2.0 Programm beendet");
    }


    public static void main(String[] args) {

        willkommen();

        lesen_laenge_breite();

        int frage1;

        System.out.println("möchte Sie das Rechteck gefüllt oder ungefüllt ausgeben lassen?");

        System.out.println("Geben Sie die 1 fuer gefüllt und die 2 für ungefüllt ein");

        frage1=derScanner.nextInt();

        if(frage1==1){
            zeichne_rechteck_gefuellt();
        }
        else if(frage1==2){
            zeichne_rechteck_ungefuellt();
        }
        else;


        beende();


    }
}