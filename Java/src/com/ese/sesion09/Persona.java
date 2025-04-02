package com.ese.sesion09;

import java.util.List;

/**
 *
 * @author camper
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fechaNac;
    private List<Actividad> actividades;

    public Persona() {
        nombre = "";
        apellido = "";
        fechaNac = null;
        actividades = null;
    }
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, Fecha fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    public void setActividad(Actividad actividad) {
        this.actividades.add(actividad);
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", actividades=" + actividades;
    }
}