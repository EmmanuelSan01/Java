package com.ese.sesion04;

/**
 *
 * @author camper
 */
public class Cadenas {
    public static void main(String[] args) {
        String cad = "Grupo C4 :D";
        // substring
        // Devuelve una subcadena comprendida en un rango de la cagena
        System.out.println(cad.substring(6, 8));
        // IndexOf
        // Devuelve el índice de la primera ocurrencia de una subcadena
        System.out.println(cad.indexOf("C4"));
        // toLowerCase
        // Convierte a minúscula toda la cadena
        System.out.println(cad.toLowerCase());
        // toUpperCase
        // Convierte a mayúscula toda la cadena
        System.out.println(cad.toUpperCase());
        // trim
        // Elimina los espacios al inicio y al final
        System.out.println("[" + "   Grupo C4 :D   ".trim() + "]");
        // equals
        System.out.println(cad.equals("GRUpo c4 :d"));
        System.out.println(cad.equalsIgnoreCase("GRUpo c4 :d"));
        // replace
        // Reemplaza una subcadena por otra
        System.out.println(cad.replace("C4 :D", "C3 :("));
        // split
        // Divide la cadena en un array según su patrón
        for(String elem : cad.split(" ")) {
            System.out.print(elem + ", ");
        }
        System.out.println("");
        // contains
        // Devuelve true si la cadena contiene a la subcadena
        System.out.println(cad.contains("C4"));
        // startsWith
        // Verifica si la cadena empieza por la subcadena
        System.out.println(cad.startsWith("Hola"));
        // endsWith
        // Verifica si la cadena termina con la subcadena
        System.out.println(cad.endsWith("C3"));
        // lastIndexOf
        // Devuelve el índice de la última ocurrencia de una subcadena
        System.out.println((cad + ". Ánimo C4 que vamos para la tarde").lastIndexOf("C4"));
        // join
        // Une elementos en una cadena con un delimitador
        System.out.println(String.join("-",cad.split(" ")));
        // matches
        // Comprueba si la cadena coincide con una expresión regular
        System.out.println(cad.matches(".*\\d+.*"));
        // isEmpty
        // Verifica si la cadena es vacía
        System.out.println(cad.isEmpty());
        System.out.println("   ".isEmpty());
        // isBlank
        // Verifica si la cadena es vacía o contiene solo espacios
        System.out.println(cad.isBlank());
        System.out.println("   ".isBlank());
        // compareTo
        // Compara dos cadenas de forma lexicográfica
        System.out.println("Camila".compareTo("CAmila"));
        System.out.println("Camila".compareTo("Camila"));
        System.out.println("CAmila".compareTo("Camila"));
        // compareToIgnoreCase
        // Compara dos cadenas ignorando mayúsculas o minúsculas
        System.out.println("Camila".compareToIgnoreCase("María"));
        System.out.println("María".compareToIgnoreCase("Camila"));
        System.out.println("CAmila".compareToIgnoreCase("camila"));
    }
}