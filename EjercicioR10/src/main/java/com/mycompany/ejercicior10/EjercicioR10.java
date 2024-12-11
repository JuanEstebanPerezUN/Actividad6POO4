/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior10;

import java.util.Scanner;
public class EjercicioR10 {

    public static void main(String[] args) {
        
        int ni;
        String nombre;
        String apellido;
        String nombre_completo;
        double pat, pagmat;
        int est;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nivel: " );
        ni = entrada.nextInt();
        
        System.out.println("Ingrese el nombre: " );
        nombre = entrada.next();
        
        System.out.println("Ingrese el apellido: " );
        apellido = entrada.next();
        
        nombre_completo = nombre + " " + apellido;
         
        System.out.println("Ingrese el patrimonio: " );
        pat = entrada.nextDouble();
        
        System.out.println("Ingrese el estrato: " );
        est = entrada.nextInt();
        
        pagmat = 50000;
        
        if ((pat>2000000)&& (est>3)){
            pagmat = pagmat + 0.03 * pat;
           }
        System.out.println("El estudiante con ni: " + ni + " y nombre " + nombre_completo + " debe pagar: " + pagmat);
        
       
    }
}
