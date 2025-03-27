package com.ese.sesion07.vehiculo;

/**
 *
 * @author camper
 */
public class Vehiculo {
    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }
    
    public void mostrar() {
        System.out.println("Marca: " + marcaModelo);
        System.out.println("Precio: " + precioDia);
        System.out.println("Número de llantas: " + numLlantas);
    }
    
    public void encenderMotor() {
        System.out.println("El motor se encendió");
    }
    
    public void apagarMotor() {
        System.out.println("El motor se apagó");
    }
    
    public void funciona() {
        System.out.println("El motor " + marcaModelo + " funciona");
    }
    
    public void pruebaMotor() {
        System.out.println("Prueba el motor de un vehículo");
    }
}