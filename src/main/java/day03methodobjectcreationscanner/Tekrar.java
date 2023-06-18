package day03methodobjectcreationscanner;

import static day03methodobjectcreationscanner.MethodCreation01.carpmaYap;

public class Tekrar {
    public static void main(String[] args) {
        String guk ="Naber";
        printKonsole(guk);

        int a=3;
        int b=5;

        carpmaYap(a,b);





    }



    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    private static void printKonsole(String guk) {
        System.out.println("guk = " + guk);
    }
}
