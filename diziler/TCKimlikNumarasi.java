//ilk 10 hanenin toplamı, 10 ile bölümünden kalan 11.sayıya eşitse; TC kimlik geçerlidir.

package com.mycompany.diziler;

import java.util.Scanner;

public class TCKimlikNumarasi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("TC kimlik numarasini giriniz: ");
        long tcKimlik=input.nextLong();
        int [] sayi=new int[11];
         
        //İlk 10 hanedeki sayıların toplamını buluyoruz.
        int toplam=0;
        for (int i = 0; i <= 10; i++) {
            int basamak=(int)(tcKimlik%10);
            sayi[10-i]=basamak;  //TC kimlik numarasındaki sayıları tek tek diziye ekliyoruz. 
            tcKimlik /=10;
            if (i !=0) {
                toplam +=basamak;
            }
        }
   
        int kalan=toplam%10;
        if (sayi[10]==kalan) {
                System.out.println("Bu TC kimlik numarasi gecerlidir.");          
        }
        else{
            System.out.println("Bu TC kimlik numarasi gecerli DEGILDIR.");
        }
        
    }
        
        
       
}
    

