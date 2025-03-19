package com.ese.sesion03;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Calificaciones {
    public static void main(String[] args) {
        double cal;
        double sum = 0;
        int pass = 0;
        int fail = 0;
        int tcal = 0;
        
        System.out.println("Voy a contar las calificaciones aprovadas.");
        System.out.println("Teclea las calificaciones (termina con -1)");
        Scanner scn  = new Scanner(System.in);
        
        do {
            cal = Double.parseDouble(scn.nextLine());
            if (cal == -1) {
                break;
            }
            tcal++;
            sum += cal;
            if(cal>=6) {
                pass++;
            } else {
                fail++;
            }
        } while(cal>=0 && cal<=10);
        
        scn.close();
        System.out.println("Obtuviste " + pass + " calificacion(es) aprovatoria(s) y " + fail + " calificacion(es) reprovatoria(s).");
        System.out.println("Tu promedio fue: " + sum/tcal);
    }
}