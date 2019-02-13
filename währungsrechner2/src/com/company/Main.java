

        import java.util.Scanner;
 import java.io.IOException;

        public class währungsrechner2
        { public static void main(String args[])
        { double Ek, Betrag, Ausgabewert;
            System.out.println ("Bitte für Eingabe von Euro 1, für Dollar 2 und für Yen 3 eingeben :");
            int zahl;
            zahl=Integer.valueOf(args[0]).intValue();

            //Eingabe Währung

            switch(zahl)
            {
                case 1://Euro
                    Scanner Eingabe = new Scanner (System.in);
                    Betrag = Eingabe.nextDouble ();

                    //Eingabe Endwährung
                    System.out.println ("Bitte für Ausgabe in Euro 1, für Dollar 2 und für Yen 3 eingeben :");
                    int zahl1;
                    zahl1=Integer.valueOf(args[0]).intValue();


                    switch(zahl)
                    {
                        case 1://Euro
                            Ausgabewert = Betrag * 1;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                        case 2://Dollar
                            Ausgabewert = Betrag * 1.31;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                        case 3://Yen
                            Ausgabewert = Betrag * 107.212 ;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                    }


                    break;

                case 2://Dollar
                    Scanner Eingabe2 = new Scanner (System.in);
                    Betrag = Eingabe2.nextDouble ();

                    //Eingabe Endwährung
                    System.out.println ("Bitte für Ausgabe in Euro 1, für Dollar 2 und für Yen 3 eingeben :");
                    int zahl2;
                    zahl2=Integer.valueOf(args[0]).intValue();


                    switch(zahl)
                    {
                        case 1://Euro
                            Ausgabewert = Betrag * 0.763489;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                        case 2://Dollar
                            Ausgabewert = Betrag * 1;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                        case 3://Yen
                            Ausgabewert = Betrag * 81.8643 ;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                    }

                    break;

                case 3://Yen
                    Scanner Eingabe3 = new Scanner (System.in);
                    Betrag = Eingabe3.nextDouble ();

                    //Eingabe Endwährung
                    System.out.println ("Bitte für Ausgabe in Euro 1, für Dollar 2 und für Yen 3 eingeben :");
                    int zahl3;
                    zahl3=Integer.valueOf(args[0]).intValue();


                    switch(zahl)
                    {
                        case 1://Euro
                            Ausgabewert = Betrag * 0.00932548 ;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                        case 2://Dollar
                            Ausgabewert = Betrag * 1;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                        case 3://Yen
                            Ausgabewert = Betrag * 0.0122148;
                            System.out.println ("Ausgabewert :" + Ausgabewert);
                            break;

                    }

                    break;

            }


        }
        }

