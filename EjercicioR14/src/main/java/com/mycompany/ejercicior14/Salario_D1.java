/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior14;


public class Salario_D1 {

    public static double salario_d1(double vd1, double vd2, double vd3, double salario_d1) {
        double totven, porven;
        double salar1;
        totven = vd1 + vd2 +vd3;
        porven = 0.33 * totven;
        
               
            
        if (vd1 > porven){
            salar1 = salario_d1 + 0.2 * salario_d1;
        } 
        else{
            salar1 = salario_d1;
        }
   
        return salar1;
 
    }
}
