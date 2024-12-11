/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior14;


public class Salario_D2 {
    
    public static double salario_d2(double vd1, double vd2, double vd3, double salario_d2) {
        double totven, porven;
        double salar2;
        totven = vd1 + vd2 +vd3;
        porven = 0.33 * totven;
        
               
            
        if (vd2 > porven){
            salar2 = salario_d2 + 0.2 * salario_d2;
        } 
        else{
            salar2 = salario_d2;
        }
   
        return salar2;
 
    } 
}
