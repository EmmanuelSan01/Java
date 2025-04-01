package com.ese.sesion08;

import java.util.Arrays;

/**
 *
 * @author camper
 */
public class Matrices {
    public static void imprimirMatriz(int[][] mat) {
        for (int f=0; f<mat.length; f++) {
            for (int c=0; c<mat[f].length; c++) {
                System.out.print(mat[f][c] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void imprimirDiagonalPrincipal(int[][] mat) {
        for (int f=0; f<mat.length; f++) {
            for (int c=0; c<mat[f].length; c++) {
                if (f ==c){
                    System.out.print(mat[f][c] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
    
    public static void transponerMatriz(int[][] mat) {
        
    }
    
    public static int[][] crearMatrizNula(int f, int c) {
        int[][] matTemp = new int[f][c];
        
        for (int i=0; i<f; i++) {
            Arrays.fill(matTemp[i], 0);
        }
        
        return matTemp;
    }
    
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        imprimirMatriz(matriz);
        System.out.println("");
        imprimirDiagonalPrincipal(matriz);
        transponerMatriz(matriz);
        
        // toString
        System.out.println(Arrays.toString(matriz[0]));
        
        // sort
        String[] names = {"Oscar", "América", "Ana"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        
        int[][] matNula = crearMatrizNula(3,2);
        imprimirMatriz(matNula);
    }
}