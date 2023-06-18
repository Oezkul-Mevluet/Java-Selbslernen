package day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //java bu satiri okumaz, Kendimize veya baskalarina aciklamadir.

        /*
        java bu satirlarida okumaz.
         */


        //Variable Wie kann man eine Variable erstellen?4
        //Data Type + Variable name + Atama Operatörü (Assignment Operator) + Variable degeri + noktali virgül
        int             age                           =                           13                  ;

        //java cümlesi ==> statement
        //Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gösterir.
        //Eger variable declaration yapar, Assignment yapmazsaniz java kendi default degerlerini koyar.
        //Default deger sayilar icin sifirdir.
        //Java da "=" assaignment operator ve java bu operatoru gördügü zaman önce sag tarafi calistirir.
        //ve sagdaki degeri alir soldaki kutuya koyar
        //Java da esittir demek ==> "=="
        //Data Type + Variable name ===> Variable Declaration
        //Assignment Operator (=) + Variable degeri ==> Assignment


        /*
        Java da temel de iki tip data vardir;
            1)primitive data type:
                char, boolean, byte, short, int, long, float, double

            2)non-primitive data type:
                String
         */

        String ogrenciIsmi = "Ali Can" ;

        //String lere verilen degerler daima cift tirnak icinde olmalidir.


        //
        char isminIlkHarfi = 'A' ;

        //Note : char data type inda degerler tek tirnak icine konulmalidir

        boolean isRetired = false;


        //byte : -128 den +127 e (dahil) tamsayi degerleri icin kullanilabilir.
        byte ogrenciYasi = 127 ;

        //short : hafizada 2 byte yer kaplar.
        short siteNufusu = 32767 ;

        //int : hafizada 4 byte yer kaplar
        int ulkeNufusu = 1313131313 ;

        //long : hafizada 8 byte yer kaplar.
        long cellNumberHumanBody = 87594151651466516L ;

        //float : 4 byte yer kaplar.
        //Note : Java ondalikli sayilari otomatik olarak double kabul eder.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99f;

        //double : 8 byte yer kaplar.
        double weightCell = 0.0000000000000000113;


        System.out.println(5);
        System.out.print(15);
        System.out.println(20);

        byte note1 = 55;
        byte note2 = 35;

        System.out.println(note1+note2);














    }



}
