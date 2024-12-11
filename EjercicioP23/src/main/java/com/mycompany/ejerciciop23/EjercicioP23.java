/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop23;

import java.util.Scanner;
public class EjercicioP23 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        a = scanner.nextDouble();
        System.out.println("Ingrese el valor de B:");
        b = scanner.nextDouble();
        System.out.println("Ingrese el valor de C:");
        c = scanner.nextDouble();
        
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        ecuacion.resolver();
   
    }
}

