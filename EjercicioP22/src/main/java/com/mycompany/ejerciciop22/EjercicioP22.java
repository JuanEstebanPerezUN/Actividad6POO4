/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop22;

import java.util.Scanner;
public class EjercicioP22 {

    public static void main(String[] args) {
        
        String nombre;
        double salarioPorHora;
        int horasTrabajadas;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el salario basico por hora: ");
        salarioPorHora = scanner.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas en el mes: ");
        horasTrabajadas = scanner.nextInt();

        
        Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);
        empleado.mostrarInformacion();
  
    }
}


