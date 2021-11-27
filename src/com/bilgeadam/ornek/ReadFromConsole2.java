package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

        public class ReadFromConsole2 {
            public static void main(String[] args) {


                int yas = 0;


                //Scanner objesi ile konsoldan veri okuyabiliyoruz.

                Scanner sc = new Scanner(System.in);

                System.out.print("Isminizi Giriniz:");

                String isim = sc.nextLine();

                System.out.print("Yasinizi Giriniz:");


                try {
                    //int yas = sc.nextInt();
                    yas = sc.nextInt();
                }
                catch(InputMismatchException e)
                    {
                        System.err.println("Hata: Yas alanina sayi girmek zorundasiniz!");
                        System.exit(-1);
                       // yas = 40;
                    }


                    //int yas2 = (int)(Double.parseDouble(sc.nextLine()));

                    if (yas <= 35) {
                        System.out.println(yas + "yasinda yolun Yolun 1. yarisindasin " + isim);
                    } else {
                        System.out.println(yas + "yasinda yolun Yolun 2. yarisindasin " + isim);
                    }

                }
            }
