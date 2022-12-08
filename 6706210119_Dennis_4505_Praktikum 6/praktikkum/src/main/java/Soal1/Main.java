/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Soal1;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        //memanggil class Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        
        //pemanggilan serta mencetak method dan hasil perhitungan dari class Lingkaran
        System.out.printf("Luas Lingkaran : %.2f", lingkaran.hitungLuas(7f));
        System.out.printf("\nLuas Lingkaran : %.2f", lingkaran.hitungLuas(5.5f));
        System.out.printf("\nLuas Lingkaran : %.2f", lingkaran.hitungLuas(20.4));

        System.out.printf("\n\nKeliling Lingkaran : %.2f", lingkaran.hitungKeliling(7f));
        System.out.printf("\nKeliling Lingkaran : %.2f", lingkaran.hitungKeliling(5.5f));
        System.out.printf("\nKeliling Lingkaran : %.2f", lingkaran.hitungKeliling(20.4));

    }
}
