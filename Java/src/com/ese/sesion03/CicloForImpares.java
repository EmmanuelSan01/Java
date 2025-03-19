package com.ese.sesion03;

/**
 *
 * @author camper
 */
public class CicloForImpares {
    public static void main(String[] args) {
        // Imprimir los impares que hay desde el 30 hasta el 0
        for(int i=29; i>0; i-=2) {
            // if(i%5==0) continue;
            System.out.print(i + ", ");
            // if(i<=10) break;
        }
        System.out.println("");
    }
}