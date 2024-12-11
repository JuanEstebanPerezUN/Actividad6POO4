/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior11;

import java.util.Scanner;
public class EjercicioR11 {

    public static void main(String[] args) {
        double n1, n2,n3, menor, mayor;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor numerico de n1");
        n1 = teclado.nextDouble();
        
        System.out.println("Ingrese el valor numerico de n2");
        n2 = teclado.nextDouble();
        
        System.out.println("Ingrese el valor numerico de n3");
        n3 = teclado.nextDouble();
        
        
            if ((n1 > n2) && (n1 > n3)){
            mayor = n1;
            }
            else if (n2>n3){
            mayor = n2;
            }
            else {
            mayor = n3;
            }
        
        System.out.println("El mayor entre: " + " "+ n1 + ", " + n2 + " y " + n3 + " es " + mayor);
    }
}
