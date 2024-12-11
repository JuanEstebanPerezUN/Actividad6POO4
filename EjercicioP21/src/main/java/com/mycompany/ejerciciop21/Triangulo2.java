/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciop21;


public class Triangulo2 {
    
    public static double obtener_perimetro(double a, double b, double c) {
    return a + b + c;
    }
    
    public static double obtener_semiperimetro(double p) {
    return p/2;
    }
    
    public static double obtener_area(double a, double b, double c, double s) {
    return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
   
}
