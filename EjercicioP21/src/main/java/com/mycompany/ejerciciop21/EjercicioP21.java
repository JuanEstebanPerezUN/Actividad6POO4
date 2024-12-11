/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop21;

import java.util.Scanner;
public class EjercicioP21 {

    public static void main(String[] args) {
        double a, b, c;
        double p,s;
        double area;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado a");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado b");
        b = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado c");
        c = entrada.nextDouble();
        
        p = Triangulo2.obtener_perimetro(a, b, c);
        s = Triangulo2.obtener_semiperimetro(p);
        area = Triangulo2.obtener_area(a, b, c, s);
        
        System.out.println("Perimetro: " + p);
        System.out.println("Semiperimetro: " + s);
        System.out.println("Area: " + area);
   
    }
}
