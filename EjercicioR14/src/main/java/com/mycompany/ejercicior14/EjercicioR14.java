/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior14;

import java.util.Scanner;
public class EjercicioR14 {

    public static void main(String[] args) {
        double vd1, vd2, vd3;
        double salario_d1, salario_d2, salario_d3;
        double salar1, salar2, salar3;
      
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese las ventas del departamento 1:  ");
        vd1 = teclado.nextDouble();
        
        System.out.println("Ingrese el salario del departamento 1:  ");
        salario_d1 = teclado.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 2:  ");
        vd2 = teclado.nextDouble();
        
        System.out.println("Ingrese el salario del departamento 2:  ");
        salario_d2 = teclado.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 3:  ");
        vd3 = teclado.nextDouble();
        
        System.out.println("Ingrese el salario del departamento 3:  ");
        salario_d3 = teclado.nextDouble();
        
        salar1 = Salario_D1.salario_d1(vd1, vd2, vd3, salario_d1);
        salar2 = Salario_D2.salario_d2(vd1, vd2, vd3, salario_d2);
        salar3 = Salario_D3.salario_d3(vd1, vd2, vd3, salario_d3);
        
        System.out.println("Salario vendedores departamento 1: " + salar1);
        System.out.println("Salario vendedores departamento 2: " + salar2);
        System.out.println("Salario vendedores departamento 3: " + salar3);
       
    }
}
