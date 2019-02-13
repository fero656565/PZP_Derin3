
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Alter;
        System.out.println("Guten Tag, wie alt sind Sie?");
        Alter = sc.nextInt();

        if (Alter > 15) {
            System.out.println("Sie können Softdrinks, Wasser mit oder ohne Sprudel bestellen");
        } else if (Alter > 17) {
            System.out.println("Sie können Softdrinks, Wasser, Bier und Wein bestellen");
        } else if (Alter > 20) {
            System.out.println("Sie können alle Getränke bestellen inklusive hochprozentige Spirituosen");
        } else {
            System.out.println("Sie müssen in Begleitung ihrer Eltern erscheinen!");
        }

    }
}