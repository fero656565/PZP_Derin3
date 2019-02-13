import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[][] feld = new int[3][3];
    static boolean freiesFeld = true;

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

        while (freiesFeld) {
            System.out.println("bitte geben Sie den x + y an");
            System.out.println("");


            int x = sc.nextInt();
            int y = sc.nextInt();

            Spielsteinsetzen(x, y, -1);
            pruefeFeld();
            gebeSpielfeld();
        }
    }
}



