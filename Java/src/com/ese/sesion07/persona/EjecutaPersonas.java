package com.ese.sesion07.persona;

/**
 *
 * @author Emmanuel
 */
public class EjecutaPersonas {
    public static void main(String[] args) {
        Persona[] personas = new Persona[9];

        //Estudiantes
        personas[0] = new Estudiante("Juan Pérez", 20, "Masculino", 1, 2.5, "Lenguas Extranjeras");
        personas[1] = new Estudiante("Ana Gómez", 22, "Femenino", 2, 3.75, "Ingeniería Informática");
        personas[2] = new Estudiante("Luis Rojas", 21, "Masculino", 3, 4.25, "Educación Primaria");

        //Docentes
        personas[3] = new Docente("Carlos Ruiz", 45, "Masculino", 1, 4500, "Ciencias");
        personas[4] = new Docente("Marta López", 50, "Femenino", 2, 4000, "Ingenierías");
        personas[5] = new Docente("Ricardo Díaz", 38, "Masculino", 3, 5000, "Salud");

        //Administrativos
        personas[6] = new Administrativo("Sofía Ramírez", 30, "Femenino", 1, "Secretaria", "Mañana");
        personas[7] = new Administrativo("Pedro Herrera", 35, "Masculino", 2, "Coordinador", "Mañana");
        personas[8] = new Administrativo("Lucía Martínez", 40, "Femenino", 3, "Directora", "Tarde");

        for (Persona p : personas) {
            p.mostrarDatos();
        }
    }
}