package com.ese.sesion08;

/**
 *
 * @author camper
 */
public class Arreglos {
    public static void main(String[] args) {
        double[] notas = {70, 80, 20, 100};
        double sum = 0.0;
        double prom = 0.0;
        double notaMax= notas[0];
        double notaMin = notas[0];
        
        // Recorrido por posición
        for (int i=0; i<notas.length; i++) {
            sum += notas[i];
        
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            } else if (notas[i] < notaMin) {
                notaMin = notas[i];
            }
        }
        sum = 0.0;
        // Recorrido por elementos
        for (double nota : notas) {
            sum += nota;
            
            if (nota > notaMax) {
                notaMax = nota;
            } else if (nota < notaMin) {
                notaMin = nota;
            }
        }
        
        prom = sum / notas.length;
        
        System.out.println("Promedio: " + prom);
        System.out.println("Nota máxima: " + notaMax);
        System.out.println("Nota mínima: " + notaMin);
    }
}