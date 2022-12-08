/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author ASUS
 */
public class Lingkaran {

    private final float phi = 3.14f;
    //Luas dengan jari-jari
    public float hitungLuas(float jari) {
        return phi * jari * jari;
    }
    //luas dengan diameter
    public double hitungLuas(double diameter) {
        return (phi * diameter * diameter) / 4;
    }
    //keliling dengan diameter
    public double hitungKeliling(double diameter) {
        return phi * diameter;
    }
    //keliling dengan jari-jari
    public float hitungKeliling(float jari) {
        return phi * 2 * jari;
    }
}
