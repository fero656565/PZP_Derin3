import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[][] feld = new int[3][3];
    static boolean freiesFeld = true;
    static int aktSpieler = 1;
    static boolean nichtGewonnen = true;


    static void spielerWechseln() {
        aktSpieler = (aktSpieler == 1) ? -1 : 1;       // Ternärer Operator
        // Bedingung ? Was, wenn Bedingung zutrifft : Was, wenn Bedingung nicht zutrifft
        // Kurzschreibweise für folgendes:

//        if(aktSpieler == 1) {
//            aktSpieler = -1;
//        }
//        else {
//            aktSpieler = 1;
//        }

    }


    static void gewinnPruefen() {


        if (    // Spalten
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

            System.out.println("Sieg!! Spieler 1 hat drei in einer Reihe.");
            nichtGewonnen = false;


        } else if ((
                 // Spalten
                 feld[0][0] == -1 && feld[0][1] == -1 && feld[0][2] == -1) ||
                (feld[1][0] == -1 && feld[1][1] == -1 && feld[1][2] == -1) ||
                (feld[2][0] == -1 && feld[2][1] == -1 && feld[2][2] == -1) ||
                // Reihen
                (feld[0][0] == -1 && feld[1][0] == -1 && feld[2][0] == -1) ||
                (feld[0][1] == -1 && feld[1][1] == -1 && feld[1][2] == -1) ||
                (feld[0][2] == -1 && feld[1][2] == -1 && feld[2][2] == -1) ||
                // Diagonalen
                (feld[0][0] == -1 && feld[1][1] == -1 && feld[2][2] == -1) ||
                (feld[0][2] == -1 && feld[1][1] == -1 && feld[2][0] == -1)) {
            nichtGewonnen = false;
            System.out.println("Sieg!! Spieler 2 hat drei in einer Reihe.");


        }

    }

    static void Spielsteinsetzen(int x, int y, int wert) {
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

    static void pruefeFeld() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (feld[x][y] == 0) {
                    // Freies Feld gefunden
                    return;
                }
            }
        }

        // Kein freies Feld gefunden
        freiesFeld = false;
    }

    public static void main(String[] args) {

        initFeld();


        while (freiesFeld && nichtGewonnen) {
            System.out.println("bitte geben Sie den x + y an");
            System.out.println("");


            int x = sc.nextInt();
            int y = sc.nextInt();


            Spielsteinsetzen(x, y, aktSpieler);

            spielerWechseln();
            pruefeFeld();
            gebeSpielfeld();
            gewinnPruefen();
        }

    }
}



