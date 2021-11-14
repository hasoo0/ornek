package com.bilgeadam.ornek;



public class HesapMakinesi {

    //method overloading
    //ayni islemle method tanimliyoruz, parametre sayisi ya da veri tipleri "double ya da int" farklidir.

    public int topla(int sayi1, int sayi2)
    {
        System.out.println("int topla calisti");
        return sayi1 + sayi2;
    }
    public  double topla(double sayi1, double sayi2)
    {
        System.out.println("double topla calisti");
        return  sayi2 + sayi2;

    }

    public int carp(int sayi1, int sayi2)
    {
        return sayi1 * sayi2;

    }
    public double bol(int sayi1, int sayi2)
    {
        return sayi1 / (double) sayi2;
    }

    public int cikar(int sayi1, int sayi2)
    {
        return sayi1 - sayi2;
    }


    public static void main(String[] args) {

        HesapMakinesi hm = new HesapMakinesi();
        System.out.println(hm.topla(5,7));
        System.out.println(hm.bol(10,4));
        System.out.println(hm.carp(10,4));
        System.out.println(hm.cikar(10,4));


        int sonuc  = hm.topla(9,4);
        System.out.println("sonuc:" + sonuc);

        System.out.println(hm.topla(4,2));
        System.out.println(hm.topla(1.4,1.7));


    }


}
