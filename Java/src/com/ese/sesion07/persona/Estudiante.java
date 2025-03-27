package com.ese.sesion07.persona;

/**
 *
 * @author camper
 */
public class Estudiante extends Persona {
    public int matricula;
    public double promedio;
    public String licenciatura;

    public Estudiante(String nombre, int edad, String sexo, int matricula, double promedio, String licenciatura) {
        super(nombre, edad, sexo);
        this.matricula = matricula;
        this.promedio = promedio;
        this.licenciatura = licenciatura;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", matricula=" + matricula + ", promedio=" + promedio + ", licenciatura=" + licenciatura + '}');
    }
}