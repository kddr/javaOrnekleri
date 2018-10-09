/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siralamalar;

import java.util.Random;

/**
 *
 * @author Mali isler
 */
public class Siralamalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int degistir;
        Random rnd=new Random();
        int[] dizi=new int[100];
        for (int i = 0; i < 100; i++) 
        {
            dizi[i]=rnd.nextInt(10000);
        }
        System.out.println("dizinin ilk hali");
        for (int i = 0; i < 100; i++) 
        {
            System.out.println(dizi[i]);
        }
        
        for (int i = 0; i < dizi.length-1; i++) 
        {
            for (int j = i; j < dizi.length; j++) 
            {
                if (dizi[i]>dizi[j]) 
                {
                    degistir=dizi[j];
                    dizi[j]=dizi[i];
                    dizi[i]=degistir;
                }
            }
        }
        
        System.out.println("dizinin büyükten küçüğe sıralanmış hali");
        for (int i = 0; i < 100; i++) 
        {
            System.out.println(dizi[i]);
        }
        
        for (int i = 0; i < dizi.length-1; i++) 
        {
            for (int j = i; j < dizi.length; j++) 
            {
                if (dizi[i]<dizi[j]) 
                {
                    degistir=dizi[j];
                    dizi[j]=dizi[i];
                    dizi[i]=degistir;
                }
            }
        }
        
        System.out.println("dizinin küçükten büyüğe sıralanmış hali");
        for (int i = 0; i < 100; i++) 
        {
            System.out.println(dizi[i]);
        }
        
    }
    
}
