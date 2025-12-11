//Basamaklarının faktöriyellerinin toplamı kendisine eşit olan sayıya Factorion Sayı denir.
package com.mycompany.diziler;

import java.util.Scanner;

public class FactorionSayisi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi=input.nextInt();
        
        int temp=sayi; //En sonda sayı ile sonucu eşitleyeceğimiz için sayı kaybolmasın diye değişken olarak aldık.
        int toplam=0;       
        while(temp>0) {
            int basamak=temp%10;
            temp /=10;
            int carpim=1;
            for (int i = 1; i <=basamak; i++) { //Faktöriyel hesabı yapıyoruz.
                carpim *=i;               
            }
            toplam +=carpim;    
        }
        if (toplam==sayi) {
            System.out.println("Girdiginiz sayi bir Factorion Sayidir.");
        }
        else{
            System.out.println("Girdiginiz sayi bir Factorion Sayi DEGILDIR.");
        }
     
    }
    
}
