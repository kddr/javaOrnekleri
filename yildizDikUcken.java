/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dikucken;
import java.util.*;
/**
 *
 * @author Mali isler
 */
public class DikUcken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner giris=new Scanner(System.in);
        System.out.print("Lütfen oluşturulacak üçgenin büyüklüğünü giriniz: ");
        int ucgen=giris.nextInt();
        for (int i = 0; i <= ucgen; i++)
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
