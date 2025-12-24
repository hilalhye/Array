//Öğrencilerin hangi dersten max ve min aldığı
package com.mycompany.diziler;

import java.util.Scanner;
import java.util.Random;

public class OgrenciHangiDerstenMaxMin {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Ogrenci sayisini(a) giriniz: ");
        int a=input.nextInt();
        System.out.print("Ders sayisini(b) giriniz: ");
        int b=input.nextInt();
        int[][] notlar=new int[a][b];
        
        System.out.println("Ogrencilerin ders notlari: ");
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[0].length; j++) {
                notlar[i][j]=rand.nextInt(100);
                System.out.print(notlar[i][j]+"-");
 
            }
            System.out.println();
        }
        for (int i = 0; i < notlar.length; i++) {
            int min=notlar[i][0];
            int max=notlar[i][0];
            for (int j = 0; j < notlar[0].length; j++) {
                if (notlar[i][j]<min) {
                    min=notlar[i][j];
                }
                else if (notlar[i][j]>max) {
                    max=notlar[i][j];
                    
                }   
                
                }
            for (int j = 0; j < notlar[0].length; j++) {
                    if (notlar[i][j]==min) {
                        System.out.println((i+1)+". ogrencinin minimum not aldigi ders:  "+j);
                    }
                    if (notlar[i][j]==max) {
                        System.out.println((i+1)+". ogrencinin maximum not aldigi ders: "+j);
                    }
            }
            

        }
        
    }
    
}
