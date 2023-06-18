package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Ornek 1 : Verilen bir string de kucuk harfleri konsola yazmayiniz
        //"Pwd12?Ab" ==>P12?A
        String a = "Pwd12?Ab";
        for (int i=0; i<a.length();i++){
            char ch = a.charAt(i);
            if (ch>='a' && ch<='z'){//kucuk harfleri sectik
                continue;
            }else {
                System.out.print(ch);
            }
        }
        //note :Break ile continue arasindaki fark nedir?
        //"break" ile switch parantezinin disina cikmak icin ve loop u kirmak icin kullanilir
        //continue ise loop yaparken bazi istenen elemanlari isleme sokmamak icin kullanilir
        //continue keywordu bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta goturur

    }
}
