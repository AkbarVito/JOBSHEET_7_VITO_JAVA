/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author asus
 */
public class LuasLingkaran {
    public static void main(String[] args){
        // Deklarasi
        Double pi, r, luas,volumebola;
        // Deskripsi
        r = 10.0;
        pi = 3.14;
        
        //Proses
        luas = pi * r * r;
        volumebola=4/3 * pi * r * r * r;
        
        //Output
        System.out.print("Luas Lingkaran = ");
        System.out.println(luas);
        System.out.print("Volume Bola = ");
        System.out.println(volumebola);
    }
    
}
