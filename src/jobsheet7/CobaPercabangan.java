/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class CobaPercabangan {
    public static void main(String[] args){
        
        String identitas = "Akbar Vito Hartono / XR5 / 05";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a < 5) System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIF.. 2");
        if (a == 5)
            System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIF.. 3");
        if(a > 5) {
            System.out.println("isi variable a : "+ a);
            System.out.println("nilai a lebih dari 5");
        }
        System.out.println("\nIF..ELSE..");
        if(a < 5) {
            System.out.println("isi variable a : "+ a);
            System.out.println("nilai a kurang dari 5");
        }else System.out.println("nilai a lebih dari satu sama dengan 5");
        
        
    }
    
}
