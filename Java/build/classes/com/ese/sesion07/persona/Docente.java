package com.ese.sesion07.persona;

/**
 *
 * @author camper
 */
public class Docente extends Persona {
    public int idTrabajador;
    public double salario;
    public String departamento;

    public String datosDocente() {
        return "Docente{" + "idTrabajador=" + idTrabajador + ", salario=" + salario + ", departamento=" + departamento + '}';
    }
}