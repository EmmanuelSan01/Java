package com.ese.sesion07.persona;

/**
 *
 * @author camper
 */
public class Administrativo extends Persona {
    public int idEmpleado;
    public String cargo;
    public String horario;

    public Administrativo(String nombre, int edad, String sexo, int idEmpleado, String cargo, String horario) {
        super(nombre, edad, sexo);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.horario = horario;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Administrativo{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", idEmpleado=" + idEmpleado + ", cargo=" + cargo + ", horario=" + horario + '}');
    }
}