package com.ese.sesion02;

/**
 *
 * @author camper
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 20;
        int d = ++b;
        int e = c--;
        
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        
        c = a*2 + 50%10 + --b;
        
        System.out.println("c: " + c);
    }    
}