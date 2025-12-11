//Klavyeden girilen n elemanlı dizilerin çarpımını bulan kod

package com.mycompany.diziler;

import java.util.Scanner;

public class DizininÇarpımı {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini(n) giriniz: ");
        int n=input.nextInt();
        int[] sayi= new int[n]; // n elemanlı bir dizi oluşturduk.
        int carpim=1;
        
        //Dizi indeksleri 0'dan başlar,bu yüzden döngüyü 0'dan n'e kadar(n hariç) götürüyoruz.
        for (int i = 0; i < sayi.length; i++) { 
            System.out.print("Dizinin "+(i+1)+". elemanini giriniz: ");
            sayi[i]=input.nextInt(); //Klavyeden girilen sayıyı önce diziye kaydediyoruz.
            carpim *= sayi[i]; //Diziye eklenen bu sayıyı çarpıma dahil ediyoruz.
            
        }
        System.out.println("Dizideki elemanlarin carpimi: "+ carpim);
    }
    
}
