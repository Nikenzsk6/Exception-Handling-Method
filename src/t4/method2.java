/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.util.Scanner;

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
    void VolumeKerucut(double jari2,double tinggi){
     double volume = (1.0/3.0)*Math.PI * Math.pow(jari2, 2) * tinggi;
        System.out.println("Volume kerucut = "+Math.round(volume));
    }
 public static void main(String[] args) {
 method2 mt = new method2();
 System.out.println(mt.luas_lingkaran(20));

 Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari kerucut = ");
        double jari2 = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut = ");
        double tinggi = input.nextDouble();
    mt.VolumeKerucut(jari2, tinggi);
 }
}

    

