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
public class ProsedurKerja2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "Merah":
                System.out.println(" Lampu merah, Berhenti!");
                break;
            case "Kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "Hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah");
        }
    }
    
}
