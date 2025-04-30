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
        p = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang"));
        l = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar"));
        int Luas_P = p*l;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang"+Luas_P);
        
    }
    public static void main(String[] args) {
        method3 m3 = new method3();
        
        m3.P_Panjang(0, 0);
        
    }
}
