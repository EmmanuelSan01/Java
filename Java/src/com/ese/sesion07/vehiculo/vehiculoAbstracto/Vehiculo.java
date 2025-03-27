package com.ese.sesion07.vehiculo.vehiculoAbstracto;

/**
 *
 * @author camper
 */
public abstract class Vehiculo {
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
    
    public abstract void pruebaMotor();
}