
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int breite;
int höhe;
        System.out.println("Bitte geben Sie die breite ein");
        breite = sc.nextInt();
        System.out.println("Bitte geben Sie die höhe ein");
        höhe = sc.nextInt();

        for (int x = 0; x <= höhe; x++) {

            for (int y = 0; y <= breite; y++) {

                if (x == 0 || x == höhe || y == 0 || y == breite  ) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}