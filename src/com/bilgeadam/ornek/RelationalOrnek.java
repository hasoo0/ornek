package com.bilgeadam.ornek;

public class RelationalOrnek {
    public static void main(String[] args) {

        //  == != > >=  <=

        int sayi1 = 9;
        int sayi2 = 9;

        String isim1 = "Mustafa";
        String isim2 = "Mustafa";

        String isim3 = (new String("bora yonet"));
        String isim4 = (new String("bora yonet"));


        if (sayi1 == sayi2)
        System.out.println("Esittir");
        else
        System.out.println("esit degildir.");

        if (isim1 == isim2)
        System.out.println("esittir");
        else
        System.out.println("esit degildir");

        if (isim3.equals(isim4))
            System.out.println("Esittir");
        else
            System.out.println("Esit degildir");



        // isimler String'de equals ile kontrol edilir == ile kontrol edilmez!!
        // ONEMLI! String ifadeler == ile degil equals ile kontrol edilir.
        // String'de equals,  olusturma biciminden bagimsiz olarak  hep dogru calisir.






    }
}
