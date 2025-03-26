package com.ese.sesion06;

/**
 *
 * @author camper
 */
public class PruebaDispositivo {
    public static void main(String[] args) {
        Dispositivo d = new Dispositivo("Samsung", 200);
        
        System.out.println("Marca: " + d.getMarca());
        System.out.println("Precio: " + d.getPrecio());
        
        d.serie = "Galaxy";
        System.out.println("Serie: " + d.serie);
    }
}
