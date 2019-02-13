package com.company;

public class Main {

    public static void main(String[] args) {
	// String Variablen
        // können Strings (Zeichenketten) aufnehmen.
        String meinName = "Ferhat";
        System.out.println("Mein Name lautet " +meinName);

        //int Variablen
        //können Ganzzahlen aufnehmen. Ganze Zahlen können positiv und negativ sein.
        //aber keinen Kommaanteil enthalten.
        //6   => Ganze Zahl
        //-10 => Ganze Zahl
        //3.5 => keine ganze Zahl
        int Zahl = 10;  //Initialisierung
        System.out.println("Meine Zahl lautet " + Zahl);

        //Wert verdoppeln: Wert * 2
        //10* 2 = 20
        Zahl = 2 * Zahl;
        System.out.println("Meine zahl lautet " + Zahl);
    }
}
