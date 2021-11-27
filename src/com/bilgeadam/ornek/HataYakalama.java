package com.bilgeadam.ornek;

public class HataYakalama {
    public static void main(String[] args) {

        try {

            int sayi1 = 7;
            int sayi2 = 0;

            double sonuc = sayi1 / sayi2;

            System.out.println("sonuc:" + sonuc);

        }
        catch (ArithmeticException e)
        {
            System.err.println("Hata: Sifira Bolme Hatasi!");
        }

            catch(Exception e)
            {

                System.err.println("Hata Olustu!" + e.getMessage());
            }
    }
}


