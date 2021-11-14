package com.bilgeadam.ornek;


public class StaticDeneme {

    int sayi1;    // instance variable
    static int sayi2;  // class variable //  degisken staric ise class variable'dir.


    public static void main(String[] args) {

        //static olmayan degiskene, static method'dan erisilemez
        //erismek istiyorsak, class'in kendi objesini olusturarak erisecegiz.


        //local variable'i biz initialize etmek zorundayiz.
        //yani ilk deger vermek zorundayiz.

        int sayi3 = 0;



        StaticDeneme sd = new StaticDeneme();


        System.out.println("sayi1:" +sd.sayi1);
        System.out.println("sayi2:" + sayi2);



    }
}
