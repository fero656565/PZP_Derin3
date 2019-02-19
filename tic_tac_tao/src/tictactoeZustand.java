

import java.util.Scanner;


public class tictactoeZustand {

    static Scanner sc = new Scanner(System.in);
    static int[][] feld = new int[3][3];
    static boolean freiesFeld = true;
    static int aktSpieler = 1;
    static boolean nichtGewonnen1 = true;
    static boolean nichtGewonnen2 = true;
    static String nameSpieler1;
    static String nameSpieler2;
    static int Match = 1;
    static int punkteSpieler1 = 0;
    static int punkteSpieler2 = 0;
    static int punkteUnentschieden = 0;
    static int wiederholeN;
    static int zustand = 1;
    static int x;
    static int y;


    static void spielerWechseln() {
        aktSpieler = ((aktSpieler == 1) ? -1 : 1);       // Ternärer Operator




            // Bedingung ? Was, wenn Bedingung zutrifft : Was, wenn Bedingung nicht zutrifft
            // Kurzschreibweise für folgendes:

//        if(aktSpieler == 1) {
//            aktSpieler = -1;
//        }
//        else {
//            aktSpieler = 1;
//        }
        }


    static void begrueßung() {
        System.out.println("Willkommen beim TicTacToe V1.0");
    }

    static void spielerName() {
        System.out.println("Bitte geben Sie den Namen vom Spieler 1 an: ");
        nameSpieler1 = sc.nextLine();
        System.out.println("Bitte geben Sie den Namen vom Spieler 2 an: ");
        nameSpieler2 = sc.nextLine();
    }


    static void gewinnPruefen() {

        // Spalten
        if (
                (feld[0][0] == 1 && feld[0][1] == 1 && feld[0][2] == 1) ||
                        (feld[1][0] == 1 && feld[1][1] == 1 && feld[1][2] == 1) ||
                        (feld[2][0] == 1 && feld[2][1] == 1 && feld[2][2] == 1) ||
                        // Reihen
                        (feld[0][0] == 1 && feld[1][0] == 1 && feld[2][0] == 1) ||
                        (feld[0][1] == 1 && feld[1][1] == 1 && feld[1][2] == 1) ||
                        (feld[0][2] == 1 && feld[1][2] == 1 && feld[2][2] == 1) ||
                        // Diagonalen
                        (feld[0][0] == 1 && feld[1][1] == 1 && feld[2][2] == 1) ||
                        (feld[0][2] == 1 && feld[1][1] == 1 && feld[2][0] == 1)) {

            punkteSpieler1++;
            System.out.println("Sieg!! " + nameSpieler1 + " hat drei in einer Reihe.");
            nichtGewonnen1 = false;


        } else if (
            // Spalten
                (feld[0][0] == -1 && feld[0][1] == -1 && feld[0][2] == -1) ||
                        (feld[1][0] == -1 && feld[1][1] == -1 && feld[1][2] == -1) ||
                        (feld[2][0] == -1 && feld[2][1] == -1 && feld[2][2] == -1) ||
                        // Reihen
                        (feld[0][0] == -1 && feld[1][0] == -1 && feld[2][0] == -1) ||
                        (feld[0][1] == -1 && feld[1][1] == -1 && feld[1][2] == -1) ||
                        (feld[0][2] == -1 && feld[1][2] == -1 && feld[2][2] == -1) ||
                        // Diagonalen
                        (feld[0][0] == -1 && feld[1][1] == -1 && feld[2][2] == -1) ||
                        (feld[0][2] == -1 && feld[1][1] == -1 && feld[2][0] == -1)) {
            nichtGewonnen2 = false;
            punkteSpieler2++;
            System.out.println("Sieg!! " + nameSpieler2 + " hat drei in einer Reihe.");

        }
    }

    static void Spielsteinsetzen(int x, int y, int wert) {

        do {
            gebeSpielfeld();
            System.out.println("X: ");
            x = sc.nextInt();
            System.out.println("Y: ");
            y = sc.nextInt();
        } while(feld[x][y] != 0);
        feld[x][y] = wert;

    }


    static void gebeSpielfeld() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("[");
                switch (feld[x][y]) {
                    case -1:
                        System.out.print("O");
                        break;
                    case 1:
                        System.out.print("X");
                        break;
                    default:
                        System.out.print(" ");
                        break;
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    static void initFeld() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                feld[x][y] = 0;
            }
        }
    }


    static void setWiederholeN() {

        System.out.println("Möchtet ihr eine neue Runde Starten? '1' für neue Runde starten eingeben");
        wiederholeN = sc.nextInt();
    }


    static void punkteZähler() {
        System.out.println("Runde: " + Match + " . " + nameSpieler1 + " hat " + punkteSpieler1 + " Punkte und " + nameSpieler2 +
                " hat " + punkteSpieler2 + " Punkte");

    }

    static void pruefeFeld(int x, int y) {
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                if (feld[x][y] == 0) {
                    // Freies Feld gefunden
                    return;
                }
            }
        }

        // Kein freies Feld gefunden
        punkteUnentschieden++;
        freiesFeld = false;
        System.out.println("Es sind keine freie Felder mehr Vorhanden. Es steht unentschieden!");

    }

    public static void main(String[] args) {

        wiederholeN = 1;
        begrueßung();

        spielerName();
        initFeld();

        while (wiederholeN == 1) {
            while (freiesFeld && nichtGewonnen1 && nichtGewonnen2) {


                System.out.println(((aktSpieler == 1) ? nameSpieler1 : nameSpieler2) + " Sie sind am Zug, viel Glück");
                System.out.println("");


                Spielsteinsetzen(x, y, aktSpieler);

                spielerWechseln();
                pruefeFeld(x, y);
               // gebeSpielfeld();
                gewinnPruefen();
                punkteZähler();

//while schleife verschachteln dass setwiederhole erst am schluss durchgeführt wird;
            }
            setWiederholeN();

        }

    }
}






