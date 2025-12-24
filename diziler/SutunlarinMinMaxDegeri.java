
package com.mycompany.diziler;

import java.util.Scanner;
import java.util.Random;

public class SutunlarinMinMaxDegeri {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Bir n sayisi giriniz: ");
        int n=input.nextInt();
        int[][] sayi=new int[n][n];
        
        System.out.println("Olusan sayilar: ");
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[0].length; j++) {
                sayi[i][j]=rand.nextInt(100);
                System.out.print(sayi[i][j]+"-");              
            }
            System.out.println();           
        }
        for (int j= 0; j < sayi[0].length; j++) {
            int min=sayi[0][j];
            int max=sayi[0][j];
            for (int i = 0; i < sayi.length; i++) {
                if (sayi[i][j]<min) {
                    min=sayi[i][j];                   
                }
                else if (sayi[i][j]>max) {
                    max=sayi[i][j];
                    
                }   
            }
            System.out.println((j+1)+". sutundaki minumum deger: "+min+" ve maximum deger: "+max);            
        }
        
    }
    
}
