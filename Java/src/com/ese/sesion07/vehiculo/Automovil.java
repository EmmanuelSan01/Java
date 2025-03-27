package com.ese.sesion07.vehiculo;

/**
 *
 * @author camper
 */
public class Automovil extends Vehiculo{
    private int numAsientos = 5;
    private int numPuertas;
    
    
    public Automovil(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        System.out.println("Se ha creado un automóvil");
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
    }
    
    public void pruebaMotor() {
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
        System.out.println("Prueba Automóvil\n");
    }
}