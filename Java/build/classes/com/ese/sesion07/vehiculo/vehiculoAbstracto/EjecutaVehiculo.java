package com.ese.sesion07.vehiculo.vehiculoAbstracto;

/**
 *
 * @author camper
 */
public class EjecutaVehiculo {
    public static void main(String[] args) {
        // Automóvil
        Automovil auto = new Automovil(120, "Volvo 550", 4, 5, 4);
        auto.mostrar();
        auto.pruebaMotor();
        // Motocicleta
        Motocicleta moto = new Motocicleta(120, "Ducati", 2, 2);
        moto.mostrar();
        moto.pruebaMotor();
        // Autobús
        Autobus bus= new Autobus(250, "Mercedes Benz", 4, 30, 4, 15);
        bus.mostrar();
        bus.pruebaMotor();
    }
}
