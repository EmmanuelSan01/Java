package com.ese.sesion06;

/**
 *
 * @author camper
 */
public class Complejo {
    private double real;
    private double imag;
    private final String i;

    public Complejo() {
        real = 0.0;
        imag = 0.0;
        i = "i";
    }

    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
        i = (this.imag != 0) ? "i": "";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public Complejo sumar(Complejo c) {
        return new Complejo(this.real + c.getReal(), this.imag + c.getImag());
    }
    
    public Complejo restar(Complejo c) {
        return new Complejo(this.real + c.getReal(), this.imag + c.getImag());
    }
    
    public String imprimir() {
        String strReal = (real != 0) ? String.valueOf(real) : "";
        String strImag = (imag != 0) ? (imag != 1) ? String.valueOf(imag) + "i" : "i" : "";
        
        return "(" + strReal + "+" + strImag + ")";
    }
}

class PruebaComplejo {
    public static void main(String[] args) {
        Complejo c1 = new Complejo(3, 2);
        Complejo c2 = new Complejo(4, 1);
        
        System.out.println(c1.imprimir() + "+" + c2.imprimir() + "=" + c1.sumar(c2).imprimir());
        
        c1.setReal(2);
        c1.setImag(-2);
        c2.setReal(2);
        c2.setImag(3);
        
        System.out.println(c1.imprimir() + "+" + c2.imprimir() + "=" + c1.restar(c2).imprimir());
    }
}