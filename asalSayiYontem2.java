/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author Mali isler
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int sayi;
        Scanner giris =new Scanner(System.in);
        
        System.out.println("Lütfen içindeki asalları bulmak istediğiniz sayıyı giriniz : ");
        sayi = giris.nextInt();

        for (int i = 2; i < sayi; i++) 
        {
            boolean t = false;
            for (int j = 2; j < i; j++) 
            {
                if (i%j==0) 
                {
                   t = true;
                   break;
                }
            }
            if (!t)
                System.out.println(i);
        }
    }
    
}
