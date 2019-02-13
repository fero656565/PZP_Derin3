public class Main {

    static int[][] feld = new int[3][3];

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

    public static void main(String[] args) {

        initFeld();
        Spielsteinsetzen(0,0,1);
        gebeSpielfeld();
    }

}


