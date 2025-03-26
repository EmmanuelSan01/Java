package com.ese.sesion06;

/**
 *
 * @author camper
 */
public class Dispositivo {
    private String marca;
    private double precio;
    String serie; // Atributo con alcance Default

    public Dispositivo(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
        this.serie = "";
    }
    
    public Dispositivo(String marca, double precio, String serie) {
        this.marca = marca;
        this.precio = precio;
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String imprimir() {
        return "Dispositivo{" + "marca=" + marca + ", precio=" + precio + ", serie=" + serie + '}';
    }
}