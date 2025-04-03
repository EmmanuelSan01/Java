package com.ese.sesion09;

import java.util.List;

/**
 *
 * @author camper
 */
class Actividad {
    private String nombre;
    private String descripcion;
    private List<Persona> personas;

    public Actividad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void setPersona(Persona persona) {
        this.personas.add(persona);
    }
}