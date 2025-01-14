/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


public class TrianguloRectangulo {
    int base; 
    int altura; 

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); 
    }
    
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
  
    }

       String determinarTipoTriangulo() {
        String tipo = null;
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
        == calcularHipotenusa())){
        tipo = "Equilatero"; 
        }

        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa())) {
            
        tipo = "Escaleno"; 
        }
    
        else {
        tipo = "Isosceles";
        }
        
        return tipo;
         }
       
       static String limpiarCampo() {
           return " ";
       }
}     
    
    
       
