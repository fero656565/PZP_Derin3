import java.util.Scanner;

public class Wechselgeld {
    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);

        System.out.print("Welcher Betrag soll aufgeteilt werden? ");
        double betrag = derScanner.nextDouble();

        // 500er
        double rest500 = betrag % 500;             // rest500: Was bleibt nach der Modulo Operation
        double aufteilen = betrag - rest500;        // restWert: Was bleibt, wenn ich Rest vom Betrag abziehe
        double anzahl500 = aufteilen / 500;      // anzahl500: Anzahl an 500er - Scheinen

        // 200er
        double rest200 = rest500 % 200;
        aufteilen = rest500 - rest200;
        double anzahl200 = aufteilen / 200;

        // 100er
        double rest100 = rest200 % 100;
        aufteilen = rest200 - rest100;
        double anzahl100 = aufteilen / 100;

        // 50er
        double rest50 = rest100 % 50;
        aufteilen = rest100 - rest50;
        double anzahl50 = aufteilen / 50;

        // 20er
        double rest20 = rest50 % 20;
        aufteilen = rest50 - rest20;
        double anzahl20 = aufteilen / 20;

        // 10er
        double rest10 = rest20 % 10;
        aufteilen = rest20 - rest10;
        double anzahl10 = aufteilen / 10;

        // 5er
        double rest5 = rest10 % 100;
        aufteilen = rest10 - rest5;
        double anzahl5 = aufteilen / 100;

        // 2er
        double rest2 = rest5 % 100;
        aufteilen = rest5 - rest2;
        double anzahl2 = aufteilen / 100;

        // 1er
        double rest1 = rest2 % 100;
        aufteilen = rest2 - rest1;
        double anzahl1 = aufteilen / 100;

        // 50ct
        double rest_50 = rest1 % 100;
        aufteilen = rest1 - rest_50;
        double anzahl_50 = aufteilen / 100;

        // 20ct
        double rest_20 = rest_50 % 100;
        aufteilen = rest_50 - rest_20;
        double anzahl_20 = aufteilen / 100;

        // 10ct
        double rest_10 = rest_20 % 100;
        aufteilen = rest_20 - rest_10;
        double anzahl_10 = aufteilen / 100;

        // 5ct
        double rest_5 = rest_10 % 100;
        aufteilen = rest_10 - rest_5;
        double anzahl_5 = aufteilen / 100;

        // 2ct
        double rest_2 = rest_5 % 100;
        aufteilen = rest_5 - rest_2;
        double anzahl_2 = aufteilen / 100;

        // 1ct
        double rest_1 = rest_2 % 100;
        aufteilen = rest_2 - rest_1;
        double anzahl_1 = aufteilen / 100;



        System.out.println("500: " + anzahl500);
        System.out.println("200: " + anzahl200);
        System.out.println("100: " + anzahl100);
        System.out.println("500: " + anzahl500);
        System.out.println("200: " + anzahl200);
        System.out.println("100: " + anzahl100);
        System.out.println("500: " + anzahl500);
        System.out.println("200: " + anzahl200);
        System.out.println("100: " + anzahl100);
    }
}
