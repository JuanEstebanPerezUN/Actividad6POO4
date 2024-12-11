/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior14;

public class Salario_D3 {
    
    public static double salario_d3(double vd1, double vd2, double vd3, double salario_d3) {
        double totven, porven;
        double salar3;
        totven = vd1 + vd2 +vd3;
        porven = 0.33 * totven;
            
        if (vd3 > porven){
            salar3 = salario_d3 + 0.2 * salario_d3;
        } 
        else{
            salar3 = salario_d3;
        }
   
        return salar3;
  
    }  
}
