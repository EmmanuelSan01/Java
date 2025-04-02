package com.ese.sesion09;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Sistema {
    Universidad universidad;
    
    public void ejecutar() {
        String opcion;
        
        do {
            opcion = menuPrincipal();
            if(ejecutarOpcion(opcion) == false) {
                break;
            }
        } while(true);
    }
    
    private String menuPrincipal() {
        char op = '\0';
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("************");
            System.out.println("\tMENU");
            System.out.println("************\n");
            System.out.println("1. Crear Universidad");
            System.out.println("2. Crear Miembro Universidad");
            System.out.println("3. Crear Avtividades");
            System.out.println("4. Informes");
            System.out.println("5. Salir\n");
            System.out.println("Elija una opción [1-5]");

            String entrada = input.nextLine().trim();

            if (entrada.isEmpty() || entrada.length()>1) {
                System.out.println("Opción inválida. Ingrese un entero de 1 a 5");
                System.out.println("Presione cualquier tecla para continuar...");
                input.nextLine();
                continue;
            }
            
            op = entrada.charAt(0);
            
            if (op<'1' || op>'5') {
                System.out.println("Opción inválida. Ingrese un entero de 1 a 5");
                System.out.println("Presione cualquier tecla para continuar...");
                input.nextLine();
                continue;
            } else {
                break;
            }
            
        } while (true);
        
        return String.valueOf(op);
    }
    
    private boolean ejecutarOpcion(String opcion) {
        
    }
    
}

class TestSistema {
    public static void main(String[] args) {
        Sistema universidad = new Sistema();
        
        universidad.ejecutar();
    }
}