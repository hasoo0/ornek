package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {

        try {

            //Scanner objesi ile konsoldan veri okuyabiliyoruz.

            Scanner sc = new Scanner(System.in);

            System.out.print("Isminizi Giriniz:");

            String isim = sc.nextLine();

            System.out.print("Yasinizi Giriniz:");

            //int yas = sc.nextInt();
            int yas = sc.nextInt();

            //int yas2 = (int)(Double.parseDouble(sc.nextLine()));

            if (yas <= 35) {
                System.out.println(yas + "yasinda yolun Yolun 1. yarisindasin " + isim);
            } else {
                System.out.println(yas + "yasinda yolun Yolun 2. yarisindasin " + isim);
            }
        }
        catch (InputMismatchException e)
        {
            System.err.println("Hata : Yas Alanina Sayi Girmek Zorundasiniz!");
        }
        catch (Exception e)
        {
           // System.err.println("Hata Olustu!" + e.getMessage());
            e.printStackTrace();
        }
    }
}
