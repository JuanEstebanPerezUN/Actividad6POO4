/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior13;

import java.util.Scanner;
public class EjercicioR13 {

    public static void main(String[] args) {
        double valcomp, valpag;
        String color;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese valor de la compra: ");
        valcomp = teclado.nextDouble();
        
        System.out.println("Ingrese el color de la bolita: ");
        color = teclado.next();
        
        valpag = Valpag.valor_a_pagar(valcomp, color);
        System.out.println("El cliente debe pagar: $" + valpag);
        
    }
}
