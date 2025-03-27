package com.ese.sesion07.persona;

/**
 *
 * @author camper
 */
public class Estudiante extends Persona {
    public int matricula;
    public double promedio;
    public String licenciatura;

    public String datosDeAlumno() {
        return "Estudiante{" + "matricula=" + matricula + ", promedio=" + promedio + ", licenciatura=" + licenciatura + '}';
    }
}