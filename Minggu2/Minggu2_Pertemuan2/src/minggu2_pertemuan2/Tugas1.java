/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2_pertemuan2;

/**
 *
 * @author macosmojave
 */
import java.util.Scanner;
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int harga;
        int totalHarga = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------");
        System.out.println("           Kharisma Agung Plaza < KAP >           ");
        System.out.println("             Promo Belanja Berhadiah              ");
        System.out.println("         Khusus Pembelian 5 Barang Pertama        ");
        System.out.println("         Dengan Harga Minimum Rp 100000,00        ");
        System.out.println("--------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli: ");
        nama = scan.nextLine();
        
        for (int i = 1; i <= 5; i++){
        System.out.print("Masukkan harga barang ke-" + i +": ");
        int hargaBarang = scan.nextInt();
        totalHarga += hargaBarang;
        }
        System.out.println("Total Harga Pembelian Atas nama " + nama + " Adalah Rp " + totalHarga);
        
        if (totalHarga >= 100000){
            System.out.println("Selamat....");
            System.out.println("Anda Mendapat Hadiah 1 buah mug cantik");
        } else {
            System.out.println("Mohon Maaf Transaksi Anda Tidak Mencukupi Untuk Mendapat Hadiah");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("                 Terima Kasih                     ");
        System.out.println("    Anda Sudah Belanja Di Kharisma Agung Plaza    ");
        System.out.println("--------------------------------------------------");
    }
    
}
