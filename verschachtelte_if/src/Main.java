
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int antwort;
        System.out.println("Funktioniert alles wie es soll? fuer ja drücken sie die 1 und fuer nein die 2");
        antwort = sc.nextInt();

        if (antwort == 1) {
            System.out.println("Lass es so!");
            System.out.println("Es gibt kein Problem");
        } else if (antwort == 2) {
            System.out.println("Hast du dran rumgefummelt?");
            antwort = sc.nextInt();
            if (antwort == 1) {
                System.out.println("Du blödmann!");
                System.out.println("Weiß jemand davon?");
                antwort = sc.nextInt();
                if (antwort == 1) {
                    System.out.println("du armes Schwein");
                } else if (antwort == 2) {
                    System.out.println("Behalt es fuer dich" + "\n" + "Es gibt kein Problem!");
                } else ;
            } else if (antwort == 2) {
                System.out.println("Bist du dafür verantwortlich?");
                antwort = sc.nextInt();
                if (antwort == 1) {
                    System.out.println("Kannst du es jemand anderes anhängen?");
                    antwort = sc.nextInt();
                    if (antwort == 1) {
                        System.out.println("Es gibt kein Problem!");
                    } else if (antwort == 2) {
                        System.out.println("du armes Schwein!");
                    } else if (antwort == 2) {
                        System.out.println("Mehr Glück als Verstand gehabt" + "\n" + "Es gibt kein Problem!");
                    } else ;
                }
            }
        }

    }
}