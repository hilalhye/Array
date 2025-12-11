//n elemanlı dizinin aritmetik,geometrik ve harmonik ortalamalarını bulan kod.

package com.mycompany.diziler;

import java.util.Scanner;

public class DizininÇeşitliOrtalamaları {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini(n) giriniz: ");
        int n=input.nextInt();
        int[] sayi=new int[n];
        int toplam=0;
        double harmonikPaydaToplami=0.0;
        long carpim=1;
        
        for (int i = 0; i < sayi.length; i++) {
            System.out.print("Dizinin "+(i+1)+". elemanini giriniz: ");
            sayi[i]=input.nextInt();  
            toplam += sayi[i];
            harmonikPaydaToplami += 1.0/sayi[i];
            carpim *= sayi[i];
        }
        //Aritmetik ortalamasını hesaplıyoruz.
        double AritmetikOrtalama= (double) toplam/n;
        
        //Geometrik ortalamasını hesaplıyoruz.
        double GeometrikOrtalama= Math.pow(carpim,(1.0/n));
         
        //Harmonik ortalamasını hesaplıyoruz.
        double HarmonikOrtalama= n/harmonikPaydaToplami;
        
        System.out.println("Dizinin Aritmetik Ortalamasi: "+AritmetikOrtalama);
        System.out.println("Dizinin Geometrik Ortalamasi: "+GeometrikOrtalama);
        System.out.println("Dizinin Harmonik Ortalamasi: "+HarmonikOrtalama);
   
    }
    
}
