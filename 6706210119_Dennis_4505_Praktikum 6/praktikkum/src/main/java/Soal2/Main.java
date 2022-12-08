/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //pemanggilan class Segitiga
        Segitiga segitiga = new Segitiga(5);
        
        //pemanggilan method yang ada pada class Segitiga
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
    }
}
