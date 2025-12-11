//Bir nesnenin serbest düşme (veya sabit ivmeli hareket)yaptığını varsayalım.Bu nesnenin hızını belirli zaman anlarında hesaplayıp kaydeden kod.
package com.mycompany.diziler;

import java.util.Scanner;

public class DüşenCisminHızı {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a=9.81; //Yer çekimi ivmesi
        int toplamSure=5; //Analiz edilecek toplam süre (saniye)
        System.out.println("Ivme(a)=9.81 m/s^2 olarak kabul edilmistir.");
        System.out.println("Analiz suresi=5 saniye olarak kabul edilmistir.");
        //Kullanıcıdan başlangıç hızını alma V(0)
        System.out.print("Lutfen cismin baslangic hizini (V0) giriniz: ");
        double V0=input.nextDouble();
        
        //Kullanacağımız dizileri tanımlıyoruz.
        int diziboyutu=toplamSure+1;
        double[] zamanlar=new double[diziboyutu];
        double[] hizlar=new double[diziboyutu];
        
        //Hesaplama yapıp dizilere atama yapıyoruz.
        for (int i = 0; i <diziboyutu; i++) {
            double t=(double) i;
            
            zamanlar[i]=t;
            hizlar[i]=V0+a*t;
     
        }
        System.out.println("Baslangic Hizi(V0): "+V0+" m/s");
        for (int i = 0; i < diziboyutu; i++) {
            System.out.println(zamanlar[i]+". saniyede "+hizlar[i]+" hizindadir.");
            
        }
  
    }
    
}
