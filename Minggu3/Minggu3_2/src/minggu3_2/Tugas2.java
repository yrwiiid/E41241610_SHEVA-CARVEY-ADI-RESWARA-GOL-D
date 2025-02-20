/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3_2;

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
        System.out.print("Masukkan jumlah Deret: ");
        int Deret = scan.nextInt();
        
        int [] Angka = new int [Deret];
         for (int i = 0; i < Deret; i++){
                Angka[i] = input.nextInt(100);
                  System.out.print(Angka[i] + " ");
             }
             System.out.println(" ");
         }
    }
    
