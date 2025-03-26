package com.ese.sesion06;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo() {
        a = 0.0;
        b = 0.0;
        c = 0.0;
    }

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

class PruebaTriangulo {
    public static void main(String[] args) {
        System.out.println(" CONSTRUCCIÓN DE UN TRIÁNGULO\n");
        
        Scanner scn  = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del lado 1");
        double a = Double.parseDouble(scn.nextLine());
        
        System.out.println("Ingrese la longitud del lado 2");
        double b = Double.parseDouble(scn.nextLine());
        
        System.out.println("Ingrese la longitud del lado 3");
        double c = Double.parseDouble(scn.nextLine());
        
        scn.close();
        
        Triangulo t = new Triangulo();
        
        t.setA(a);
        t.setB(b);
        t.setC(c);
        
        double maxSide = Math.max(Math.max(a, b), c);
        
        if (maxSide < (a+b+c-maxSide)) {
            System.out.print("\nLas tres longitudes forman un triángulo ");
            if (a==b && b==c) {
                System.out.print("equilátero");
            } else if (a==b || a==c || b==c) {
                System.out.print("isósceles");
            } else {
                System.out.print("escaleno");
            }
            System.out.println("");
        } else {
            System.out.println("No se puede formar un triángulo con las longitudes ingresadas");
        }
    }
}