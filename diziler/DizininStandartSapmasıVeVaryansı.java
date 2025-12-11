// Klavyeden girilen dizinin standart sapması ve varyansını bulan kod.
package com.mycompany.diziler;

import java.util.Scanner;

public class DizininStandartSapmasıVeVaryansı {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini(n) giriniz: ");
        int n=input.nextInt();
        int sayi[]=new int[n];
        int toplam=0;
        double varyansToplami=0;
        
        for (int i = 0; i < sayi.length; i++) {
            System.out.print("Dizinin "+(i+1)+". elemanini giriniz: ");
            sayi[i]=input.nextInt();
            toplam += sayi[i];           
        }
        //Dizinin ortalamasını hesaplıyoruz.
        double ortalama= (double)toplam/n;
        
        //Şimdi de dizinin Varyansını hesaplıyoruz.
        for (int i = 0; i < sayi.length; i++) {
            double fark= sayi[i]-ortalama;
            varyansToplami += (fark*fark);
        }
        double varyans= varyansToplami/n;
        
        //Son olarak dizinin Standart Sapmasını hesaplıyoruz.
        double standartSapma= Math.sqrt(varyans); //Karekök fonksiyonu
        
        System.out.println("Dizinin Varyansi: "+varyans);
        System.out.println("Dizinin Standart Sapmasi: "+standartSapma);
       
    }
    
}
