package praktikum;

import java.util.Scanner;


public class Trousers extends Pakaian implements Penjualan {
    private String bahan;

    public Trousers(String bahan) {
        this.bahan = bahan;
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
        stok = 100;
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
    
}
