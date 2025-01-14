/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopp19;


public class Triangulo_Equilatero {
    int lado;
    
    Triangulo_Equilatero(int lado) {
        this.lado = lado;
    }
    
    double obtenerArea()    {
        return (Math.pow(lado,2) * Math.sqrt(3)) / 4 ;
        }
    
    double obtenerAltura()    {
        return (lado * Math.sqrt(3)) / 2 ;
         }
    
    double obtenerPerimetro()    {
        return lado * 3 ;
        }
}
