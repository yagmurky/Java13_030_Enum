package com.yagmur;

import com.yagmur.entity.Cinsiyet;
import com.yagmur.entity.Personel;
import com.yagmur.entity.State;
import com.yagmur.entity.Unvan;

public class Runner {
    public static void main(String[] args) {
        Personel personel=new Personel("Murat", "Taş", Unvan.MUDUR, State.PASIF, Cinsiyet.ERKEK);
        personel=new Personel("Ayşe","Tekin",Unvan.GENEL_MUDUR, State.AKTIF, Cinsiyet.ERKEK);
        personel=new Personel("Bahar", "Korkmaz",Unvan.CEO,State.BEKLEMEDE, Cinsiyet.KADIN);

        if (personel.getCinsiyet()==Cinsiyet.KADIN){
            System.out.println("Kadın için hediye gönderildi.");
        }else if (personel.getCinsiyet()==Cinsiyet.ERKEK){
            System.out.println("Erkek için hediye gönderildi.");
        }else {
            System.out.println("Genel bir hediye gönderildi.");
        }


       String mesaj=  switch (personel.getCinsiyet()) {
           case ERKEK -> "Erkek için hediye gönderildi.";
           case KADIN -> "Kadın için hediye gönderildi.";
           case BELIRTMEK_ISTEMIYOR -> "Genel bbir hediye gönderidli.";
           default -> "Genel hediye gönderildi.";
       };
        System.out.println(mesaj);
    }

}
