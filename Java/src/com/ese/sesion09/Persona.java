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
    private static int contPersona = 0;
    private int codigo;
    
    public Persona() {
        crearPersona("", "", null);
    }
    
    public Persona(String nombre, String apellido) {
        crearPersona(nombre, apellido, null);
    }

    public Persona(String nombre, String apellido, Fecha fechaNac) {
        crearPersona(nombre, apellido, fechaNac);
    }
    
    private void crearPersona(String nombre, String apellido, Fecha fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        actividades = null;
        codigo = ++contPersona;
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
    
    public int getCodigo() {
        return codigo;
    }
}