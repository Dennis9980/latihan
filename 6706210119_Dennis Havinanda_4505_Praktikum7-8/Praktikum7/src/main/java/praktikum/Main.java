/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Baby
 */
public class Main {
    public static void main(String[] args) {
        Dress dress = new Dress("Piyama");
        Trousers trous = new Trousers("Satin");
        
        //Dress
        System.out.println("\nDress: ");
        dress.stok();
        System.out.println("Stoknya sejarang: " + dress.stokTersedia());
        System.out.println("Dijual 50");
        dress.jualProduk(50);
        
        //Trousers
        System.out.println("\nTrousers");
        trous.stok();
        System.out.println("Stok Sekarang: " + trous.stokTersedia());
        System.out.println("Dijual 50");
        trous.jualProduk(50);
    }
}
