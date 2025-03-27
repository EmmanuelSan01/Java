package com.ese.sesion07.persona;

/**
 *
 * @author camper
 */
public class Persona {
    public String nombre;
    public int edad;
    public String sexo;

    public String mostrarDatos() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
}
