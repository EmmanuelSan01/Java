package com.ese.sesion07.usuario;

/**
 *
 * @author camper
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("123456", "Emmanuel Sánchez", "123456");
        
        System.out.println(e.getNombre());   
    }
}