package com.ese.sesion06;

/**
 *
 * @author camper
 */
public class Rectangulo {
    private double largo;
    private double ancho;
    
    public Rectangulo() {
        largo = 1;
        ancho = 1;
    } 

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) throws Exception {
        if (largo>=0 && largo<=20) {
            this.largo = largo;
        } else {
            throw new Exception("El valor del largo no está en el rango [0-20]");
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) throws Exception {
        if (ancho>=0 && ancho<=20) {
            this.ancho = ancho;
        } else {
            throw new Exception("El valor del ancho no está en el rango [0-20]");
        }
    }
    
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }
    
    public double getArea() {
        return largo * ancho;
    }
}

class PruebaRectangulo {
    public static void main(String[] args) throws Exception {
        Rectangulo r = new Rectangulo(10, 30);
        
        System.out.println("El perimetro es: " + r.getPerimetro());
        // r.setAncho(-2);
        System.out.println("El área es: " + r.getArea());
    }
}