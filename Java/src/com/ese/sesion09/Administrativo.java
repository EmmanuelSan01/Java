package com.ese.sesion09;

/**
 *
 * @author camper
 */
public class Administrativo extends Persona{

    Administrativo(String nombre, String apellido, Fecha fecha) {
        super(nombre, apellido, fecha);
    }
    
    @Override
    public String toString() {
        return "Administrativo{" + super.toString() + '}';
    }   
}