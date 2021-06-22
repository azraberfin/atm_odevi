package com.abkholding.odev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnaSinif {

    public static void main(String[] args) {

        BireyselMusteri mus1 = new BireyselMusteri();
        mus1.setTc("23456754678");
        mus1.setAdSoyad("Enes Yılmaz");
        mus1.setAdres("Yılmaz mah.");
        mus1.setBakiye(200000);

        BireyselMusteri mus2 = new BireyselMusteri();
        mus2.setTc("23456754678");
        mus2.setAdSoyad("Yunus Öztürk");
        mus2.setAdres("Öztürk mah.");
        mus2.setBakiye(3242424);

        KurumsalMusteri mus3 = new KurumsalMusteri();
        mus3.setTc("12354389009");
        mus3.setAdSoyad("Bilal Tanrıverdi");
        mus3.setSirket("Tanrıverdi Sirketi");
        mus3.setBakiye(23455667);

        KurumsalMusteri mus4 = new KurumsalMusteri();
        mus4.setTc("45278900987");
        mus4.setAdSoyad("Yusuf Ekşioglu");
        mus4.setSirket("Ekşioglu Sirketi");
        mus4.setBakiye(123334);

        BireyselMusteri mus5 = new BireyselMusteri();
        mus5.setTc("17898706784");
        mus5.setAdSoyad("Furkan Yaman");
        mus5.setAdres("Medcezir mah.");
        mus5.setBakiye(2345);


        //collection
        Map<String,Musteri> musteriMap = new HashMap<>();
        musteriMap.put("111",mus1);
        musteriMap.put("222",mus2);
        musteriMap.put("333",mus3);
        musteriMap.put("444", mus4);
        musteriMap.put("555", mus5);


        Scanner scan = new Scanner(System.in);
        System.out.println("Banka Müşteri Numarası Giriniz: ");
        String x = scan.nextLine();
        System.out.println("Banka numarası: " + x);

        if(musteriMap.get(x).getClass() == new BireyselMusteri().getClass()){
            BireyselMusteri a = (BireyselMusteri) musteriMap.get(x);
            System.out.println("adres : " + a.getAdres() + "Tc: " + a.getTc() + "Ad: " + a.getAdSoyad() + " adres: " + a.getAdres() + "bakiye: " + a.getBakiye());
        }
        else{
            KurumsalMusteri a = (KurumsalMusteri) musteriMap.get(x);
            System.out.println("Şirket ismi : " + a.getSirket() + "Tc: " + a.getTc() + "Ad: " + a.getAdSoyad() + " adres: " + a.getAdres() + "bakiye: " + a.getBakiye());
        }

        Scanner girdi = new Scanner(System.in);
        System.out.println("1: para yatırma ; 2: para çekme -   ");
        String in = girdi.nextLine();

        Islemler a = new Islemler();
        a.dondur(in);

    }
}
