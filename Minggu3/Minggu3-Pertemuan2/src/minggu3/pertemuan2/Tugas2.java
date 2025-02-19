/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3.pertemuan2;

/**
 *
 * @author macosmojave
 */
import java.util.Scanner;
import java.util.Random;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random input = new Random ();
        System.out.print("Masukkan jumlah Kolom: ");
        int Kolom = scan.nextInt();
        System.out.print("Masukkan jumlah baris: ");
        int Baris = scan.nextInt();
        
        int [][] angka = new int [Kolom][Baris];
         for (int i = 0; i < Kolom; i++){
             for (int j = 0; j < Baris; j++){
                 angka [i][j]=input.nextInt(101);
                  System.out.print(angka[i][j] +" ");
             }
             System.out.println(" ");
         }
    }
}
