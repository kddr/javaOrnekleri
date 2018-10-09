/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asaltekrarkendiyontemim;

import java.util.Scanner;

/**
 *
 * @author Mali isler
 */
public class AsalTekrarKendiYontemim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int sayi,sayac=0;
        Scanner giris =new Scanner(System.in);
        
        System.out.println("Lütfen içindeki asalları bulmak istediğiniz sayıyı giriniz* : ");
        sayi = giris.nextInt();
        for (int i = 1; i < sayi; i++) 
        {
            sayac=0;
            for (int j = 1; j < sayi; j++) 
            {
                if (i%j==0) 
                {
                    sayac++;
                }
            }
            if (sayac==2) 
            {
                System.out.println(i);
            }
        }
    }
    
}
