package com.ese.sesion03;

/**
 *
 * @author camper
 */
public class CicloForPares {
    public static void main(String[] args) {
        // Imprimir los primeros 10 números pares
        for(int p=1; p<11; p++) {
            int par = 2*(p-1);
            System.out.print(par + ", ");
        }
        System.out.println("");
        
        for (int p=0; p<19; p+=2) {
            System.out.print(p + ", ");
        }
        System.out.println("");
    }
}