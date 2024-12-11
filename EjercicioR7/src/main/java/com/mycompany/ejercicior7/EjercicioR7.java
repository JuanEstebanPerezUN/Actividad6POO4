/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior7;

import java.util.Scanner;
public class EjercicioR7 {

    public static void main(String[] args) {
        double a, b;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor numerico a");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor numerico b");
        b = entrada.nextDouble();
        
        if (a > b){
            System.out.println(a + " es mayor que " + b);
        }
        else if (a==b){
            System.out.println(a + " es igual que " + b); 
        }
        else{
            System.out.println(a + " es menor que " + b);
        }
    }
}
