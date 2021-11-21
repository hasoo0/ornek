package com.bilgeadam.ornek;

public class Farkli_If_Ornek {
    public static void main(String[] args) {

        int yas = 26;

        String  durum =(yas<35)?"Genc":"Yasli";

        System.out.println(durum);

        if (yas<35)
            durum = "genc";
        else
            durum = "yasli";

    }
}
