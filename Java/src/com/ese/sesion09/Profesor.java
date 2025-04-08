package com.ese.sesion09;

/**
 *
 * @author camper
 */
public class Profesor extends Persona{

    Profesor(String nombre, String apellido, Fecha fecha) {
        super(nombre, apellido, fecha);
    }
    
    @Override
    public String toString() {
        return "Profesor{" + super.toString() + '}';
    }   
}