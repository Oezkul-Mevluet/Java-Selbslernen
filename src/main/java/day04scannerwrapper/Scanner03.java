package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz: ");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);
        System.out.println(sayi1 / sayi2);
        System.out.println(sayi1 * sayi2);


    }
}