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
     double volume = (1.0/3.0)*3.14* Math.pow(jari2, 2) * tinggi;
        System.out.println("Volume kerucut = "+Math.round(volume));
    }
    void volumeTabung(double jr2,double t){
        double v_tabung = 3.14*Math.pow(jr2, 2)*t;
        System.out.println("Volume Tabung = "+Math.round(v_tabung));
    }
    void Volumebola(double jari_2){
        double volBola = (0.4/0.3)*3.14 *Math.pow(jari_2, 3);
        System.out.println("Volume Bola = "+Math.round(volBola));
    }
 public static void main(String[] args) {
 method2 mt = new method2();
 System.out.println(mt.luas_lingkaran(20));

 Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan jari-jari kerucut = ");
        double jari2 = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut = ");
        double tinggi = input.nextDouble();
    mt.VolumeKerucut(jari2, tinggi);
    
        System.out.print("\nMasukkan jari-jari tabung = ");
        double jr2 = input.nextDouble();
        System.out.print("Masukkan tinggi tabung = ");
        double t = input.nextDouble();
    mt.volumeTabung(jr2, t);
        System.out.print("\nMasukkan jari-jari bola = ");
        double jari_2 = input.nextDouble();
    mt.Volumebola(jari_2);
    System.exit(0);
 }
}

    

