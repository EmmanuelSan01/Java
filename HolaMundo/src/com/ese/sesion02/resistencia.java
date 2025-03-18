package com.ese.sesion02;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class resistencia {
    public static void main(String[] args) {
        double r1 = 0;
        double r2 = 0;
        double r3 = 0;
        Scanner scn = new Scanner(System.in); 
        do {
            System.out.println("Ingrese el valor de la resistencia 1");
            r1 = Integer.parseInt(scn.nextLine());
        } while(r1<=0);
        do {
            System.out.println("Ingrese el valor de la resistencia 2");
            r2 = Integer.parseInt(scn.nextLine());
        } while(r2<=0);
        do {
            System.out.println("Ingrese el valor de la resistencia 3");
            r3 = Integer.parseInt(scn.nextLine());
        } while(r3<=0);
        
        double req = 1/(1/r1+1/r2+1/r3);
        System.out.println("La resistencia equivalente es: " + req);
    }
}