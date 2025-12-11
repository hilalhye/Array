//n tane vatandaşın notunu girin.Kaç kişi kaldı kaç kişi geçti yazdır.(ortalamanın altında kalanlar kaldı, üstündekiler geçti.) 
package com.mycompany.diziler;

import java.util.Scanner;

public class NotOrtalamasıKaldıGeçti {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen vatandas sayisini(n) giriniz: ");
        int n=input.nextInt();
        int[] vatandas=new int[n];
        int toplam=0;
        
        for (int i = 0; i < vatandas.length; i++) {
            System.out.print((i+1)+". vatandasin notunu giriniz: ");
            vatandas[i]=input.nextInt();  
            toplam += vatandas[i];
        }
        double ortalama= (double) toplam/n; 
        
        //Bulduğumuz ortalamaya göre kaç kişinin kalıp kaç kişinin geçtiğini hesaplıyoruz.
        int kalankisi=0;
        int gecenkisi=0;
        for (int i = 0; i < vatandas.length; i++) {
            if (vatandas[i]<ortalama) {
                kalankisi++;       
            }
            else if (vatandas[i]>=ortalama) {
                gecenkisi++;               
            }           
        }
        System.out.println("Ortalama: "+ortalama);
        System.out.println("Gecen kisi sayisi: "+gecenkisi);
        System.out.println("Kalan kisi sayisi: "+kalankisi);
    }   
}
