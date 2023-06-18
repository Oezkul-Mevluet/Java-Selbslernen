package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ülke ismi giriniz");
        String countryName = input.nextLine();

        switch (countryName.toUpperCase()){
            case "AMERICA":
                System.out.println("US");
                break;
            case "ENGLAND":
                System.out.println("UK");
                break;
            case "GERMANY":
                System.out.println("DE");
                break;
            case "TURKEY":
                System.out.println("TR");
                break;
            case "INDIA":
                System.out.println("IN");
                break;
            case "PERU":
                System.out.println("PE");
                break;
            case "SPAIN":
                System.out.println("ES");
                break;
            case "BULGARIA":
                System.out.println("BG");
                break;
            case "ALBANIA":
                System.out.println("AL");
                break;
            case "FRANCE":
                System.out.println("FR");
                break;
            default:
                System.out.println("Gecersiz giris");
        }
    }
}
