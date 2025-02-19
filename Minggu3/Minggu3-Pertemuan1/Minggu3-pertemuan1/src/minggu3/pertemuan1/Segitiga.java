    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3.pertemuan1;

/**
 *
 * @author macosmojave
 */
import java.util.Scanner;
public class Segitiga {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga: ");
        int jumlah = scan.nextInt();
        
        for (int i = jumlah; i >= 1;i--){
           for (int j = 1; j <= jumlah - i;j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= (2*i-1);j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
    
}
