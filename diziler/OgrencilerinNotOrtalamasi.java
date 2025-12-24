
package com.mycompany.diziler;

import java.util.Random;
import java.util.Scanner;

public class OgrencilerinNotOrtalamasi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Ogrenci sayisi(a) giriniz: ");
        int a=input.nextInt();
        System.out.print("Ders sayisi(b) giriniz: ");
        int b=input.nextInt();
        int[][] ogrenci=new int[a][b];
        double[] ortalamalar=new double[a];
        
        System.out.println("Ogrencilerin ders notlari: ");
        for (int i = 0; i < ogrenci.length; i++) {
            for (int j = 0; j < ogrenci[0].length; j++) {
                ogrenci[i][j]=rand.nextInt(100);
                System.out.print(ogrenci[i][j]+"-");               
            }
            System.out.println();            
        }
        for (int i = 0; i < ogrenci.length; i++) {
            int toplam=0;
            for (int j = 0; j < ogrenci[0].length; j++) {
                toplam += ogrenci[i][j];          
            }
            ortalamalar[i]=(double) toplam/b;            
        }
        for (int i = 0; i < ortalamalar.length; i++) {
            System.out.println((i+1)+". ogrencinin notlarinin ortalamasi: "+ortalamalar[i]);
            
        }   
    }
    
}
