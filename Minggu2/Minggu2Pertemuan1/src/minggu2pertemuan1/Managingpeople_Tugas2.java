/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2pertemuan1;

/**
 *
 * @author macosmojave
 */
public class Managingpeople_Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person ("Arial", 37);
        Person p2 = new Person ("Joseph", 15);
        
        if (p1.getage() == p2.getage())
        {
            System.out.println(p1.getname()+" is the same age as "+ p2.getname());    
        }else
            System.out.println(p1.getname()+" is Not same age as "+ p2.getname());
    }
    
}