package com.ese.sesion02;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class TarifaBasica {
    public static void main(String[] args) {
        String id = "";
        char estado = '0';
        char estrato = '0';
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese su documento de identidad");
        id = scn.nextLine();
        System.out.println("Ingrese su estado A=activo / S=suspendido");
        estado = scn.nextLine().charAt(0);
        System.out.println("Ingrese su estrato");
        estrato = scn.nextLine().charAt(0);
        if (estado == 'S' || estado == 's') {
            System.out.println("La tarifa básica del usuario " + id + " es 0");
        } else if (estado == 'A' || estado == 'a'){
            if (estrato == '1') {
                System.out.println("La tarifa básica del usuario " + id + " es $10.000");
            } else if (estrato == '2') {
                System.out.println("La tarifa básica del usuario " + id + " es $15.000");
            } else if (estrato == '3') {
                System.out.println("La tarifa básica del usuario " + id + " es $30.000");
            } else if (estrato == '4') {
                System.out.println("La tarifa básica del usuario " + id + " es $50.000");
            } else if (estrato == '5') {
                System.out.println("La tarifa básica del usuario " + id + " es $65.000");
            } else {
                System.out.println("Valor incorrecto para estrato. Ingrese un entero entre 1 y 5");        
            }
        } else {
            System.out.println("Valor incorrecto para estado. Ingrese una letra 'A' o 'S'");
        }
    }
}