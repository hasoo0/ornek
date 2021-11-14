package com.bilgeadam.ornek;

public class VeriTipleri {
    public static void main(String[] args) {

        int yas = 27;

        char cinsiyet = 'E';

        String sehir = "Ankara";


        if (yas<35)
        {
            System.out.println("genc");

        }
        else
        {
            System.out.println("yasli");
        }


        // i++ ==> i = i+1 demek
        for (int i = 1;  i<=10; i++)
        {
            System.out.println(i+ "Merhaba");
        }
        System.out.println("sehir index:" + sehir.indexOf("k"));
        if (sehir.indexOf("k")>= 0)
        {
            System.out.println("incinde k harfi var!");
        }

        String deneme = "Bora Yuret";
        System.out.println(deneme.substring(5));

    }


}
