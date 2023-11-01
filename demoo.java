/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tess;

/**
 *
 * @author naufa
 */
public class demoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
         hitung kubus = new kubus(6);
         System.out.println("Volume Kubus: " + kubus.Volume());
         System.out.println("Luas Permukaan Kubus: " + kubus.LuasPermukaan());

         hitung balok = new balok(5, 4, 3);
         System.out.println("Volume Balok: " + balok.Volume());
         System.out.println("Luas Permukaan Balok: " + balok.LuasPermukaan());
     }
}