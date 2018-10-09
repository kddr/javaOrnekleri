/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriyel;
import java.util.*;
/**
 *
 * @author Mali isler
 */
public class Faktoriyel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner giris=new Scanner(System.in);
        int sayi,sonuc=1;
        System.out.println("Faktöryelinin hesaplanmasını istediğiniz sayıyı giiniz : ");
        sayi=giris.nextInt();
        System.out.println(" "+sayi);
        for (int i = 1; i <= sayi;i++) 
        {
            sonuc=i*sonuc;
        }
        System.out.println(" "+sonuc);
    }
    
}
