//Klavyeden girilen n adet nokta çiftinin kartezyen koordinat sisteminde kaçıncı bölgede olduğunu bulan kod.

package com.mycompany.diziler;

import java.util.Scanner;

public class KoordinatSistemi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen nokta çifti sayisini(n) giriniz: ");
        int n=input.nextInt();
        int[] apsisler=new int[n];
        int[] ordinatlar=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". nokta için: ");
            
            System.out.print("Apsis(x) degeri: "); 
            apsisler[i]=input.nextInt(); //x değerini apsisler dizisine atadık.
            
            System.out.print("Ordinat(y) degeri: ");
            ordinatlar[i]=input.nextInt(); //y değerini ordinatlar dizisine atadık.         
        }
        // Son olarak dizilerdeki verileri okuyup hangi bölgede olduklarını yazdırıyoruz.
        for (int i = 0; i < n; i++) {
            int x=apsisler[i];
            int y=ordinatlar[i];
            
            System.out.print((i+1)+". nokta ("+x+","+y+"): ");
            
            if (x>0 && y>0) {
                System.out.println("1.Bolge");
            }
            else if (x<0 && y>0) {
                System.out.println("2.Bolge");              
            }
            else if (x<0 && y<0) {
                System.out.println("3.Bolge");    
            }
            else if (x>0 && y<0) {
                System.out.println("4.Bolge");              
            }
            else if (x==0 && y==0) {
                System.out.println("Orijin");              
            }
            else if (x==0) {
                System.out.println("y ekseni uzerinde");               
            }
            else if (y==0) {
                System.out.println("x ekseni uzerinde");
                
            } 
        }
    }  
}
