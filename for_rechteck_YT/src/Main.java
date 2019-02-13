

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int höhe;

        int breite;


        System.out.println("höhe?");
höhe = sc.nextInt();
        System.out.println("breite");
        breite = sc.nextInt();
        int n=breite;
        int m=höhe;


        for(int i=0; i<=höhe; i++){
            for(int j=0; j<=breite; j++){
                if(i==0 || j==0 || i==n || j==m ){
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
        }







    }
}
