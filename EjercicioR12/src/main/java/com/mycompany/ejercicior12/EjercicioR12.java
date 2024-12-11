/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior12;

import java.util.Scanner;
public class EjercicioR12 {

    public static void main(String[] args) {
        String nombre;
        double nht, vhn, salario;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next();
        
        System.out.println("Ingrese numero de horas trabajadas: ");
        nht = teclado.nextDouble();
        
        System.out.println("Ingrese valor hora normal trabajada: ");
        vhn = teclado.nextDouble();
        
        salario = Empleado.obtener_salario(nht, vhn);
        System.out.println("El trabajador: " + nombre + " devengo $ " + salario);
  
    }
}
