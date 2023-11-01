/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tess;

/**
 *
 * @author naufa
 */
public class kubus extends hitung {
     private final double s;

     public kubus(double s) {
         this.s = s;
     }
     @Override
     public double Volume() {
         return s*s*s;
     }
     @Override
     public double LuasPermukaan() {
         return 6 * s * s;
     }
}
