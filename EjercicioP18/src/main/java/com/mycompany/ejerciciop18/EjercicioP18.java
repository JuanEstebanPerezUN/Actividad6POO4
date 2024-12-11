/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop18;

import java.util.Scanner;
public class EjercicioP18 {

    public static void main(String[] args) {
       
        double salario_bruto;
        double salario_neto;
        String nombre, apellido, nombre_empleado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese codigo del empleado");
        int codigo_empleado = entrada.nextInt();
        System.out.println("Ingrese nombre del empleado");
        nombre = entrada.next();
        System.out.println("Ingrese apellido del empleado");
        apellido = entrada.next();
        nombre_empleado = nombre + " " + apellido;
        System.out.println("Ingrese valor de la retencion");
        double porcentaje_retencion = entrada.nextDouble();
       
        porcentaje_retencion = Empleado.calcular_porcentaje_retencion(10);
        salario_bruto = Empleado.calcular_salario_bruto(40, 90000);
        salario_neto = Empleado.calcular_salario_neto(salario_bruto, porcentaje_retencion);
        
        System.out.println("Codigo: " + codigo_empleado );
        System.out.println("Nombre: " + nombre_empleado);
        System.out.println("Salario Neto: " + salario_neto );
        System.out.println("Salario Bruto: " + salario_bruto );
    }
}
