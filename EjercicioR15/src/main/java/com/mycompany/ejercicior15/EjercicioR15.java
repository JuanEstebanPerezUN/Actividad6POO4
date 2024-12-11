/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior15;

import java.util.Scanner;
public class EjercicioR15 {

    public static void main(String[] args) {
        double pesoa, pesob, pesoc, pesod;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera a:  ");
        pesoa = teclado.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera b:  ");
        pesob = teclado.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera c:  ");
        pesoc = teclado.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera d:  ");
        pesod = teclado.nextDouble();
        
        if (pesoa == pesob && pesoa == pesoc) {
            System.out.println("La esfera d es la diferente: ");
            if (pesod > pesoa) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } 
        else if (pesoa == pesob && pesoa == pesod) {
            System.out.println("La esfera c es la diferente: ");
            if (pesoc > pesoa) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } 
        else if (pesoa == pesoc && pesoa == pesod) {
            System.out.println("La esfera b es la diferente: ");
            if (pesob > pesoa) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } 
        else {
            System.out.println("La esfera a es la diferente: ");
            if (pesoa > pesob) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        }
    }
}
