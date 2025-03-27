package com.ese.sesion07.usuario;

/**
 *
 * @author camper
 */
public class Estudiante extends Usuario {
    private String codigoEstudiante;

    public Estudiante(String codigoEstudiante, String nombre, String documento) {
        super(nombre, documento);
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    @Override
    public String getNombre() {
        return super.nombre.toUpperCase();
    }
}