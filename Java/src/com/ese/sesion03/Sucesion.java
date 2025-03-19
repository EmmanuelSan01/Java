package com.ese.sesion03;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Sucesion {
    public static void main(String[] args) {
        int n;
        
        Scanner scn  = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un número entero entre 1 y 104");
            n = Integer.parseInt(scn.nextLine());
        }while(n<1 || n>104);
        for(int i=1; i<=n; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }
}