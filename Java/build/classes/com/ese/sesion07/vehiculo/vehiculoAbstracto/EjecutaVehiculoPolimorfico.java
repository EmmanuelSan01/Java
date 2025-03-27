package com.ese.sesion07.vehiculo.vehiculoAbstracto;

/**
 *
 * @author camper
 */
public class EjecutaVehiculoPolimorfico {
    public static void main(String[] args) {
        // Automóvil
        Vehiculo auto = new Automovil(120, "Volvo 550", 4, 5, 4);
        // Motocicleta
        Vehiculo moto = new Motocicleta(120, "Ducati", 2, 2);
        // Autobús
        Vehiculo bus= new Autobus(250, "Mercedes Benz", 4, 30, 4, 15);
        
        Vehiculo[] v = {auto, moto, bus};
        
        for(Vehiculo elem : v){
            elem.mostrar();
            elem.pruebaMotor();
        }
    }
    /*
    No se pueden crear objetos de clases abstractas
        Vehiculo ve = new Vehiculo();
    */
}