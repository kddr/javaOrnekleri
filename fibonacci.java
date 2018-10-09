/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Mali isler
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int sayi;
        int a=0,b=1,c=0;
        Scanner giris =new Scanner(System.in);
        
        System.out.println("Lütfen Fibonacci hesabını bulmak istediğiniz sayıyı giriniz : ");
        sayi = giris.nextInt();
        
        for (int i = 0; i < sayi; i++) 
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    
}
