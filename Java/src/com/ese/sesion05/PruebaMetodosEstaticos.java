package com.ese.sesion05;

/**
 *
 * @author camper
 */
public class PruebaMetodosEstaticos {
    public static void main(String[] args) {
        // Llamado a un método estático
        // Primero se debe crear la instancia de la clase para poder acceder
        MetodosNoEstaticos mn = new MetodosNoEstaticos();
        mn.Mensaje();
        // Llamado a un método estático
        MetodosEstaticos.Mensaje();
    }
}

class MetodosNoEstaticos {
    public void Mensaje() {
        System.out.println("NO soy un método estático");
    }
}

class MetodosEstaticos {
    public static void Mensaje() {
        System.out.println("SOY un método estático");
    }
}