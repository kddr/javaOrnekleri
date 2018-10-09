/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.*;
/**
 *
 * @author Mali isler
 */
public class JavaApplication6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    String degisim;
    String[] dizi={"k","ö","p","ü","m"};
    ArrayList liste= new ArrayList();
    String[] karakterMetin={"a","b","c","ç","d","e","f","g","ğ","h","i","ı","j","k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z","w","x"};
    for (int i = 0; i < karakterMetin.length; i++) 
    {
        liste.add(karakterMetin[i]);
    }
    for (int i = 0; i < dizi.length-1; i++) 
    {
        for (int j = i; j < dizi.length; j++) 
        {
            if (liste.indexOf(dizi[i])>liste.indexOf(dizi[j])) 
            {
                degisim=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=degisim;
            }
        }
    }
        for (int i = 0; i < dizi.length; i++) 
        {
            System.out.println(dizi[i]);
        }
    }
}


  
