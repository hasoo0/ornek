package com.bilgeadam.ornek;

import java.util.Locale;

public class KucukBuyukHarfeCevirme {
    public static void main(String[] args) {

        String isim = "mustafa";

        // Buyuk harfe cevir.

        System.out.println(isim.toUpperCase());

        String isim1 = "BORA";
        System.out.println(isim1.toLowerCase());

        String isim3 = "izmili IGDELER";

        System.out.println(isim3.toUpperCase());

        System.out.println(isim3.replace("i", "I").toUpperCase());

        String isim4 = "IGDIRLI ispanaklar";
        System.out.println(isim4.toLowerCase());

        Locale localeTR = new Locale("tr", "TR");

        String kelime = "izinli ISTANBUL";
        System.out.println(kelime.toUpperCase(localeTR));


    }
}
