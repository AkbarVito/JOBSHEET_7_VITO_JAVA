/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Kalkulator {
    public static void main(String [] args){
        double a;
        double b;
        double hasil;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Kalkulator");
        System.out.print("a: " );
        a = keyboard.nextDouble();
        System.out.print("b: " );
        b= keyboard.nextDouble();
        
        hasil = a + b;
        System.out.println("hasil penjumlahan= " + hasil);
        
        hasil = a - b;
        System.out.println("hasil pengurangan " + hasil);
        
       hasil = a * b;
       System.out.println("hasil perkalian " + hasil);
       
       hasil = a / b;
       System.out.println("hasil pembagian " + hasil);
    }
    
}
