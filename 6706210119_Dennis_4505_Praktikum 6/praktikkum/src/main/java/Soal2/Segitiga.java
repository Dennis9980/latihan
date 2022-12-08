/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    private int sisi;
    
    //konstruktor
    public Segitiga(int sisi) {
        this.sisi = sisi;
    }
    //Method untuk menghitung keliling
    public void hitungKeliling(){
        //rumus keliling
        int keliling = sisi + sisi + sisi;
        
        //untuk mencetak hasil keliling
        System.out.println("\nKeliling Segitiga : " + keliling);
    }
    //Method untuk menghitung luas
    public void hitungLuas(){
        //rumus luas
        double tinggi = Math.sqrt(sisi * sisi - (sisi/2 * sisi/2));
        double luas = (sisi * tinggi) / 2;
        
        //untuk mencetak hasil luas
        System.out.printf("Luas Segitiga : %.2f", luas);
    }
}
