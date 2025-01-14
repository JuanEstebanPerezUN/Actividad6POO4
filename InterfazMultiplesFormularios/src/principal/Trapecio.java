/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


public class Trapecio {
    int a, b, c, d, h;    
   
     Trapecio(int a, int b, int c, int d, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        
    }

    double calcularArea() {
        return (h / 2) * (b + d );
    }
    double calcularPerimetro(){
        return a+b+c+d;
    }
    
    static String limpiarCampo(){
    return " ";
    }
}
