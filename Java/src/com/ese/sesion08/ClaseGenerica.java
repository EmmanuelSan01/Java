package com.ese.sesion08;

/**
 *
 * @author camper
 */
public class ClaseGenerica<T> {
    private T dato;
    
    public void add(T dato) {
        this.dato = dato;
    }
    
    public T get() {
        return dato;
    }
}