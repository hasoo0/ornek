package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsoleSon {

    static String isim = "";
    static int yas = 0;

    Scanner sc = new Scanner(System.in);


    public String isimSor() {
        String ad = "";
        System.out.println("Isminizi Giriniz:");
        ad = sc.nextLine();

        return ad;
    }

    public int yasSor() {
        try {
            int localYas = 0;
            System.out.println("Yasinizi Giriniz:");
            localYas = Integer.parseInt(sc.nextLine());

            return localYas;

        } catch (NumberFormatException e) {
            System.err.println("Hata: Yas alanina sayi girmek zorundasin");
            return -99;
        }
    }
        public void sonucYazdir ()
        {
            if (yas <= 35)
                System.out.println("yolun 1.yarisindasin" + isim);
            else
                System.out.println("yolun 2. yarisindasin" + isim);

        }


        public static void main (String[] args)
        {
            ReadFromConsoleSon son = new ReadFromConsoleSon();
            isim = son.isimSor();
            yas = son.yasSor();

            while (yas < 0) {
                yas = son.yasSor();
            }
            son.sonucYazdir();


        }
    }

