package com.ese.sesion07.persona;

/**
 *
 * @author camper
 */
public abstract class Persona {
    public String nombre;
    public int edad;
    public String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public abstract void mostrarDatos();
}