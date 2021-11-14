package com.bilgeadam.ornek;

public class oyuncu {

    //static tanimlanirsa class variable'dir.
    //bir obje degeri degistirilirse,
    //diger objeler degisririlen degeri gorur.

    //static demezsek instance varianle'dir.
    //her obje degiskenlerin ilk degerleriyle baslar.
    //ornek, int ise sifir degerleriyle baslar her obje icin
    //bir objenin degiskende yaptigi degisikligi,
    //diger objeler goremez.

    private static int sayac;
    private int no;
    private String ad;
    private String soyad;

    public oyuncu() {
        sayac= sayac + 1 ;

    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
