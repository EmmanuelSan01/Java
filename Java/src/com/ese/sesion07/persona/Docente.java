package com.ese.sesion07.persona;

/**
 *
 * @author camper
 */
public class Docente extends Persona {
    public int idTrabajador;
    public double salario;
    public String departamento;

    public Docente(String nombre, int edad, String sexo, int idTrabajador, double salario, String departamento) {
        super(nombre, edad, sexo);
        this.idTrabajador = idTrabajador;
        this.salario = salario;
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Docente{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", idTrabajador=" + idTrabajador + ", salario=" + salario + ", departamento=" + departamento + '}');
    }
}