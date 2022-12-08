package praktikum;

import java.util.Scanner;

public class Dress extends Pakaian implements Penjualan{
    private String model;

    public Dress(String model) {
        this.model = model;
    }

    @Override
    public int totalPenjualan(int qty) {
        int penjualan = qty * harga;
        return penjualan;
    }

    @Override
    public int stokTersedia() {
        return stok;
    }

    @Override
    public void jualProduk(int qty) {
        int sisaProduk = stokTersedia() - qty;
        System.out.println("Sisa produk saat ini : " + sisaProduk);
        System.out.println("Total penjualan: " + totalPenjualan(qty));
    }

    @Override
    public void stok() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input ukuran: ");
        ukuran = input.next().charAt(0);
        System.out.println("Input warna: ");
        warna = input.next();
        System.out.println("Input harga: ");
        harga = input.nextInt();
        System.out.println("Input stok: ");
        stok = input.nextInt();
        
 
    }
    
}
