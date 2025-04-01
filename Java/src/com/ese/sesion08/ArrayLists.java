package com.ese.sesion08;

import java.util.ArrayList;

/**
 *
 * @author camper
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> arrlst = new ArrayList<> ();
        
        arrlst.add("Colombia");
        arrlst.add("Venezuela");
        arrlst.add(1, "Ecuador");
        
        System.out.println(arrlst);
        System.out.println(arrlst.get(2));
        
        // Recorrer por elementos
        for (String elem : arrlst) {
            System.out.print(elem + ", ");
        }
        System.out.println("");
        // Recorrer por posiciones
        for (int i=0; i<arrlst.size(); i++) {
            System.out.print(arrlst.get(i) + " - ");
        }
        
        // contains
        System.out.println(arrlst.contains("Argentina"));
        
        // indexOf
        System.out.println(arrlst.indexOf("Chile"));
        System.out.println(arrlst.indexOf("Venezuela"));
        
        // remove
        System.out.println(arrlst.remove("Venezuela"));
        
        // Crear clase genérica que contiene un ArrayList
        ClaseGenerica<ArrayList> cg = new ClaseGenerica<>();
        
        // Agregar el ArrayList a la clase gnérica
        cg.add(arrlst);
        
        // Obtener el valor de la clase genérica
        System.out.println(cg.get());
    }
}