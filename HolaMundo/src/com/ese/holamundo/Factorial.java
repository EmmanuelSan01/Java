package com.ese.holamundo;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Factorial {
    public long calculo(int num) {
        long fact=1;
        if(num < 2) return 1;
        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }
}

class PruebaFactorial {
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = Integer.parseInt(scn.nextLine());
        System.out.println("El factorial de " + num + " es: " + fac.calculo(num));        
        scn.close();
    }
}