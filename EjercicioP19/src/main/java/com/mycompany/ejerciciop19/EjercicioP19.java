/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop19;

import java.util.Scanner;
public class EjercicioP19 {

    public static void main(String[] args) {
        
        double perimetro, altura, area;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado");
        double lado = entrada.nextDouble();
        
        perimetro = Triangulo.obtener_perimetro(lado);
        area = Triangulo.obtener_area(lado);
        altura = Triangulo.obtener_altura(lado);
        
        System.out.println("perimetro: " + perimetro);
        System.out.println("area: " + area);
        System.out.println("altura: " + altura);
        
           
    }
}
