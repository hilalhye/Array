//Klavyeden girilen n elemanlı dizinin en küçük ve en büyük elemanların hangi indeksde olduğunu bulduran kod.
package com.mycompany.diziler;

import java.util.Scanner;

public class EnBuyukEnkucukHangiİndeksde {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin kac elemanli(n) oldugunu giriniz: ");
        int n=input.nextInt();
        int[] tamsayi=new int[n];
        
        for (int i = 0; i < tamsayi.length; i++) {
            System.out.print((i+1)+". elemani giriniz: ");
            tamsayi[i]=input.nextInt();           
        }
        //Burda dizideki en küçük(min) ve en büyük(max) değerleri buluyoruz.
        int min=tamsayi[0];
        int max=tamsayi[0];
        for (int i = 1; i < tamsayi.length; i++) {
            if (tamsayi[i]<min) {
                min=tamsayi[i];                
            }
            else if (tamsayi[i]>max) {
                max=tamsayi[i];               
            }           
        }
        //Son olarak max ve min değerlerin hangi indeksde olduğunu buluyoruz.
        if (min==max) {
            System.out.println("Dizideki tum sayilar birbirine esit ve "+min+"'dir.");
            System.out.println("Bu yuzden ayri ayri en kucuk,en buyuk indeksi yoktur.");   
        }
        else{
            for (int i = 0; i < tamsayi.length; i++) {
                if (tamsayi[i]==min) {
                    System.out.println("En kucuk degerin bulundugu indeks: "+i);              
                }
                else if (tamsayi[i]==max) {
                    System.out.println("En buyuk degerin bulundugu indeks: "+i);               
                }
            }   
        }
    }
}
