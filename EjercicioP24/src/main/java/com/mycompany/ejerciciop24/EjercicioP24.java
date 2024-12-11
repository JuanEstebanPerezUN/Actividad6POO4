/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop24;

import java.util.Scanner;
public class EjercicioP24 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        Esfera esferaA = new Esfera(scanner.nextDouble());

        System.out.println("Ingrese el peso de la esfera B:");
        Esfera esferaB = new Esfera(scanner.nextDouble());

        System.out.println("Ingrese el peso de la esfera C:");
        Esfera esferaC = new Esfera(scanner.nextDouble());

        if (esferaA.getPeso() > esferaB.getPeso() && esferaA.getPeso() > esferaC.getPeso()) {
            System.out.println("La esfera A tiene el mayor peso.");
        } else if (esferaB.getPeso() > esferaA.getPeso() && esferaB.getPeso() > esferaC.getPeso()) {
            System.out.println("La esfera B tiene el mayor peso.");
        } else if (esferaC.getPeso() > esferaA.getPeso() && esferaC.getPeso() > esferaB.getPeso()) {
            System.out.println("La esfera C tiene el mayor peso.");
        } else {
            System.out.println("Hay esferas con el mismo peso mayor.");
        }

    }
}