/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2pertemuan1;

/**
 *
 * @author macosmojave
 */

class book {
    int price;
    int pages;

public void set (int price, int pages){
    this.price = price;
    this.pages = pages;
}

public void show () {
    System.out.println("books information");
    System.out.println("Books price : " + price);
    System.out.println("number of pages : "+ pages);
}
    
}
    public class  ProsedurKerja3{
    public static void main(String[] args) {
        book javabook = new book ();
        javabook.set(60000, 100);
        javabook.show();
        
    }
  
}
