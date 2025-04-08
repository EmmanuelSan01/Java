package com.ese.sesion09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author camper
 */
public class Universidad {
    private Map<Integer, Persona> personas;
    private List<Actividad> actividades;
    
    public Universidad() {
        personas = new HashMap<>();
        actividades = new ArrayList<>();
    }

    public Map<Integer, Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Map<Integer, Persona> personas) {
        this.personas = personas;
    }
    
    public Persona getPersona(int codigo) {
        return personas.get(codigo);
    }
    
    public void setPersona(Persona persona) {
        this.personas.put(persona.getCodigo(), persona);
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