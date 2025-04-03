package com.ese.sesion09;

/**
 *
 * @author camper
 */
public class Estudiante extends Persona{

    Estudiante(String nombre, String apellido, Fecha fecha) {
        super(nombre, apellido, fecha);
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + '}';
    }   
}