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
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        String nomor;
        
        System.out.println("        CAFE CERIA      ");
        System.out.println("      ANEKA MINUMAN     ");
        System.out.println("------------------------");
        
        System.out.println("    SPECIAL MENU:    ");
        System.out.println("1. Soft Drinks       ");
        System.out.println("2. Mix Juice         ");
        System.out.println("3. Nescafe           ");
        System.out.println("4. Soda Milk         ");
        System.out.println("5. Tea               ");
        System.out.println("------------------------");
        
        System.out.print("Masukkan nama Pembeli: ");
        nama = scan.nextLine();
        System.out.print("Silahkan Masukkan Pilihan Anda: ");
        nomor = scan.nextLine();
        
        switch (nomor) {
            case "1":
                System.out.println("Minuman Yang Anda Pilih Adalah Soft Drink");
                break;
            case "2":
                System.out.println("Minuman Yang Anda Pilih Adalah Mix Juice");
                break;
            case "3":
                System.out.println("Minuman Yang Anda Pilih Adalah Nescafe");
                break;
            case "4":
                System.out.println("Minuman Yang Anda Pilih Adalah Soda Milk");
                break;
            case "5":
                System.out.println("TMinuman Yang Anda Pilih Adalah Tea");
            default:
                System.out.println("Tidak Valid");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih "+ nama + " telah berkunjung di CAFE CERIA");
    }
    }
