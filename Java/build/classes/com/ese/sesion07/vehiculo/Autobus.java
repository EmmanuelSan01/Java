package com.ese.sesion07.vehiculo;

/**
 *
 * @author camper
 */
public class Autobus extends Vehiculo{
    private int numAsientos = 41;
    private int numPuertas;
    private int numVentanillas;
    
    
    
    public Autobus(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas, int numVentanillas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
        System.out.println("Se ha creado un autobús");
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
        System.out.println("Ventanillas: " + numVentanillas);
    }
    
    public void pruebaMotor() {
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
        System.out.println("Prueba Autobús\n");
    }
}
