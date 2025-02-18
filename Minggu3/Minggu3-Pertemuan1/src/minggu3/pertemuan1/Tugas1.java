/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3.pertemuan1;

/**
 *
 * @author macosmojave
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //menentukan batas awal
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scan.nextInt();
        //menentukan batas akhir
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scan.nextInt();
        
        System.out.println("Bilangan genap dari "+batasAwal+" sampai "+batasAkhir+" adalah: ");
        
        for (int i = batasAwal; i <= batasAkhir; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
