/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class method3 {
    void P_Panjang(int p,int l){
        JOptionPane.showMessageDialog(null,"Mencari Luas Persegi Panjang");
        p = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang (cm)"));
        l = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar (cm)"));
        int Luas_P = p*l;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang "+Luas_P+"cm.");
        
    }void Segitiga(int a,int t){
        JOptionPane.showMessageDialog(null,"Mencari Luas Segitiga");
        a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan alas (cm)"));
        t = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi (cm)"));
        double  Luas_Sgt = 0.5*a*t;
        JOptionPane.showMessageDialog(null, "Luas Segitiga "+Math.round(Luas_Sgt)+"cm.");
        
    
    }void Lingkaran(double jari2){
        JOptionPane.showMessageDialog(null,"Mencari Luas Lingkaran");
        jari2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari (cm)"));
        double  Luas_Ling = 3.14 * Math.pow(jari2, 2);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran "+Luas_Ling+"cm.");
        
    }
    
    public static void main(String[] args) {
        method3 m3 = new method3();
        
        m3.P_Panjang(0, 0);
        m3.Segitiga(0, 0);
        m3.Lingkaran(0);
        
    }
}
