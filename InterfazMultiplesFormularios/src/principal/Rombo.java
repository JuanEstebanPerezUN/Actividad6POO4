/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


public class Rombo {
    int D; 
    int d; 
    int lado;

    Rombo(int D, int d, int lado) {
        this.D = D;
        this.d = d;
        this.lado = lado;
    }

    double calcularArea() {
        return (D * d) / 2;
    }
    double calcularPerimetro(){
        return lado * 4;
    }
    
    static String limpiarCampo() {
    return " ";
    }
    
    
}
