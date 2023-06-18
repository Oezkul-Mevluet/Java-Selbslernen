package day04scannerwrapper;

import java.util.Scanner;

public class Tekrar04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("3 adet sayi giriniz");

        double t = input.nextInt();
        double k = input.nextInt();
        double p = input.nextInt();
        System.out.println(ortalama(t, k, p));

        System.out.println("üc basamakli bir sayi giriniz: ");
        int sayi = input.nextInt();

        int birlerBasamagi = sayi % 10;
        sayi = sayi / 10;

        int onlarBasamagi = sayi % 10;
        sayi = sayi / 10;

        int yuzlerBasamagi = sayi;

        System.out.println("Sayinin basamaklari toplami : " + (birlerBasamagi + onlarBasamagi + yuzlerBasamagi));


    }

    private static double ortalama(double t, double k, double p) {

        return (t + k + p) / 3;

    }
}
