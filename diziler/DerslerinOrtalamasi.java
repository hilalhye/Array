
package com.mycompany.diziler;

import java.util.Scanner;
import java.util.Random;

public class DerslerinOrtalamasi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Ogrenci sayisini(a) giriniz: ");
        int a=input.nextInt();
        System.out.print("Ders sayisini(b) giriniz: ");
        int b=input.nextInt();
        int[][] dersler=new int[a][b];
        double[] ortalama=new double[b];
        
        System.out.println("Ogrencilerin ders notlari: ");
        for (int i = 0; i < dersler.length; i++) {
            for (int j = 0; j < dersler[0].length; j++) {
                dersler[i][j]=rand.nextInt(100);
                System.out.print(dersler[i][j]+"-");               
            }
            System.out.println();            
        }
        for (int j = 0; j < dersler[0].length; j++) {
            int toplam=0;
            for (int i = 0; i < dersler.length; i++) {
                toplam += dersler[i][j];               
            }
            ortalama[j]= (double) toplam/a;            
        }
        for (int i = 0; i < ortalama.length; i++) {
            System.out.println((i+1)+". dersin ortalamasi: "+ortalama[i]);
            
        }
    }
    
}
