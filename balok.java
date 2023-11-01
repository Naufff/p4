/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tess;
/**
 *
 * @author naufa
 */
public class balok extends hitung{
     private double p, l, t;

     public balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

     @Override
     public double Volume() {
         return p * l * t;
    }

     @Override
     public double LuasPermukaan() {
        return 2 * (p * l + p * t + l * t);
     }
}
