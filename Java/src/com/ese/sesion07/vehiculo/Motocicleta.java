package com.ese.sesion07.vehiculo;

/**
 *
 * @author camper
 */
public class Motocicleta extends Vehiculo{
    private int numAsientos = 1;
    
    
    public Motocicleta(int precioDia, String marcaModelo, int numLlantas, int numAsientos) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        System.out.println("Se ha creado una motocicleta");
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Asientos: " + numAsientos);
    }
    
    public void pruebaMotor() {
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
        System.out.println("Prueba Motocicleta\n");
    }
}