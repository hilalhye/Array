
package com.mycompany.diziler;

import java.util.Scanner;
import java.util.Random;

public class DerslerdenMaxVeMinNotuAlanKisi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Ogrenci sayisini(a) giriniz: ");
        int a=input.nextInt();
        System.out.print("Ders sayisini(b) giriniz: ");
        int b=input.nextInt();
        int[][] ogrenci=new int[a][b];
        
        System.out.println("Ogrencilerin ders notlari: ");
        for (int i = 0; i < ogrenci.length; i++) {
            for (int j = 0; j < ogrenci[0].length; j++) {
                ogrenci[i][j]=rand.nextInt(100);
                System.out.print(ogrenci[i][j]+"-");               
            }
            System.out.println();            
        }
        for (int j = 0; j < ogrenci[0].length; j++) {
            int min=ogrenci[0][j];
            int max=ogrenci[0][j];
            for (int i = 0; i < ogrenci.length; i++) {
                if (ogrenci[i][j]<min) {
                    min=ogrenci[i][j];                    
                }
                else if (ogrenci[i][j]>max) {
                    max=ogrenci[i][j]; 
                }
                
            } 
            System.out.print((j+1)+". ders icin en dusuk not: "+min+": ");
            for (int i = 0; i < ogrenci.length; i++) {
                if (ogrenci[i][j]==min) {
                    System.out.print("Ogrenci: "+i+" ");               
            }
            
            }
            System.out.println();
            
            System.out.print((j+1)+". ders icin en yuksek not: "+max+": ");
            for (int i = 0; i < ogrenci.length; i++) {
                if (ogrenci[i][j]==max) {
                    System.out.print("Ogrenci: "+i+" ");                    
                }                
            }
            System.out.println();
        
            
        }
        
       
    }
    
}
