/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioRR7;


public class Validar {
    
    double a;
    double b;
    
    public static String validar(double a, double b) {
        
        if (a>b) {
            return " A es mayor que b";
         }
        
        else if (a==b) {
            return "A es igual que B";
            
        }
        
        else{
            return "A es menor que B";
        }
    }
    
    public static String limpiar_campo() {
        return " " ;
    }
}
