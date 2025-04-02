package com.ese.sesion09;

import java.util.List;

/**
 *
 * @author camper
 */
public class Universidad {
    private List<Persona> personas;
    private List<Actividad> actividades;

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
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
}