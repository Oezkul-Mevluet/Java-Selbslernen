package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek: Verilen character büyük harf ise ekrana "Büyük harf" yazdiran,
        //kücük harf ise "Kucuk harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir Character giriniz: ");
        char ch = input.next().charAt(0);

        //1. Yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Büyük Harf");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");
        }

        //2. Yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Büyük Harf");
        }else if (ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");
        }else {
            System.out.println("Harf degil");
        }
    }
}
