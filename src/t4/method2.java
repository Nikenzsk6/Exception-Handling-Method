/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

/**
 *
 * @author HP
 */
public class method2 {
    public double luas_lingkaran(int diameter) {
 int jari2 = diameter / 2;
 double luas = Math.PI * Math.pow(jari2, 2);
 return luas;
 }
 public static void main(String[] args) {
 method2 mt = new method2();
 System.out.print(mt.luas_lingkaran(20));
 System.exit(0);
 }
}

    

