/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2pertemuan1;

/**
 *
 * @author macosmojave
 */
public class Person {
    String name ;
    int age;
    
    public Person (String name, int age){
      this.name = "";
      this.age = '0';
      this.name = name;
      this.age = age ;
    }
    public String getname (){
        return name;
    }
    
    public int getage (){
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }
    
}
