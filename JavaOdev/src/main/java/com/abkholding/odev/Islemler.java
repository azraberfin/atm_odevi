package com.abkholding.odev;

public class Islemler {

    private String a;

    public String getSayi() {
        return a;
    }

    public void setSayi(String sayi) {
        this.a = sayi;
    }

    public void dondur(String a) {

        switch (a) {
            case "1":
                System.out.println("Paranız yatırma işlemi başarılı.");
                break;
            case "2":
                System.out.println("Para çekme işlemi başarılı.");
                break;
            default:
                System.out.println("1 yada 2 giriniz.");
                break;
        }

    }


}
