package com.ese.sesion02;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class CaracterFactor {
    public static void main(String[] args) {
        char cara = '0';
        double real = 0;
        double res = 0;
    
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese uno de los siguientes caracteres (n, u, m, K, M, G)");
        cara = scn.nextLine().charAt(0);
        System.out.println("Ingrese un número real");
        real = Double.parseDouble(scn.nextLine());
        
        switch(cara) {
            case 'n':
                res = real * 0.000000001;
                break;
            case 'u':
                res = real * 0.000001;
                break;
            case 'm':
                res = real * 0.001;
                break;
            case 'K':
                res = real * 1000;
                break;
            case 'M':
                res = real * 1000000;
                break;
            case 'G':
                res = real * 1000000000;
                break;
            default:
                System.out.println(Double.NaN);
        }
        System.out.println("El resultado es: " + res);
    }
}