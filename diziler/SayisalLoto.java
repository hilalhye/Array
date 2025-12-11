//6 tane rastgele 1-49 arası sayı üret.Kullanıcıdan 6 tane sayı iste.Kullanıcının kaç tane sayıyı doğru tahmin ettiğini bulan kodu yaz.
package com.mycompany.diziler;

import  java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SayisalLoto {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        int[] rastgeleSayilar=new int[6];
        
        //1-49 arası rastgele sayı üretiyoruz.Ve onu diziye kaydediyoruz.
        for (int i = 0; i < 6; i++) {
            rastgeleSayilar[i]=rand.nextInt(49)+1; //rand.nextInt(49): 0-48 arası sayı üretir.Eklediğimiz(+1), 0'ı 1'e ve 48'i de 49'a kaydırır.           
        }
        //Kullanıcıdan 6 tane tahmin alıp kaydediyoruz.
        int[] tahmin=new int[6];
        System.out.println("Lutfen 1-49 arasi 6 tane sayi giriniz: ");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Tahmin edilen sayi: ");
            tahmin[i]=input.nextInt();           
        }
        int dogruTahmin=0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (tahmin[i]==rastgeleSayilar[j]) {
                    dogruTahmin++;   
                }                
            }           
        }
        System.out.println("Rastgele Sayilar: "+Arrays.toString(rastgeleSayilar)); //Dizideki sayıları yazdırıyoruz.
        System.out.println("Tahmin edilen sayilar: "+Arrays.toString(tahmin));
        System.out.println("Dogru tahmin sayisi: "+dogruTahmin);    
    }
}
