import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int zahl1;

        System.out.println("Bitte geben Sie eine Zahl ein von 1 beginnend aufwärts");

        zahl1= sc.nextInt();

        if(zahl1 % 2 == 0){
            // Zahl ist gerade
            System.out.println("ihre Zahl ist eine gerade Zahl");
        } else if (zahl1 % 2 == 1) {
            // Zahl ist ungerade
            System.out.println("ihre Zahl ist eine ungerade Zahl");
        } else {

        }


    }


}
