package com.ese.sesion09;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Sistema {
    Universidad universidad;
    
    public void ejecutar() {
        char opcion;
        
        do {
            opcion = menuPrincipal();
            if(ejecutarOpcion(opcion) == false) {
                System.out.println("\n****Fin de ejecución***");
                
                break;
            }
        } while(true);
    }
    
    private char menuPrincipal() {
        char op = '\0';
        
        do {
            Scanner input = new Scanner(System.in);
            
            System.out.println("************");
            System.out.println("    MENU");
            System.out.println("************\n");
            System.out.println("1. Crear Universidad");
            System.out.println("2. Crear Miembro Universidad");
            System.out.println("3. Crear Avtividades");
            System.out.println("4. Informes");
            System.out.println("5. Salir\n");
            System.out.println("Elija una opción [1-5]");

            if (input.hasNext()) {
                input.next();
            }
            
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
                input.close();
                
                break;
            }
        } while (true);
        
        return op;
    }
    
    private boolean ejecutarOpcion(char opcion) {
        switch (opcion) {
            case '1':
                crearUniversidad();
                mostrarMensaje("La universidad fue creada con éxito.");                
            break;
            case '2':
                crearMiembroUniversidad();
                mostrarMensaje("El miembro fue creado con éxito.");                
            break;
            case '3':
            break;
            case '4':
            break;
            case '5':
            return false;
        }
        
        return true;
    }
    
    public void crearUniversidad() {
        if (universidad == null) {
            universidad = new Universidad();
        }
    }
    
    public void mostrarMensaje(String msg) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n--> " + msg);
        System.out.println("Presione cualquier tecla para continuar....");
        input.nextLine();
        
        input.close();
    }
    
    public void crearMiembroUniversidad() {
        if (universidad == null) {
            mostrarMensaje("La universidad no existe. Se debe crear primero uno universidad y luego los miembros");
            
            return;
        }
        
        char op = '\0';
        
        do {
            Scanner input = new Scanner(System.in);
            
            System.out.println("******************************");
            System.out.println(" 2. Crear Miembro Universidad");
            System.out.println("******************************\n");
            System.out.println("1. Crear Alumno");
            System.out.println("2. Crear Profesor");
            System.out.println("3. Crear Administrativo");
            System.out.println("4. Salir\n");
            System.out.println("Elija una opción [1-4]");

            if (input.hasNext()) {
                input.next();
            }
            
            String entrada = input.nextLine().trim();

            if (entrada.isEmpty() || entrada.length()>1) {
                System.out.println("Opción inválida. Ingrese un entero de 1 a 4");
                System.out.println("Presione cualquier tecla para continuar...");
                input.nextLine();
                
                continue;
            }
            
            op = entrada.charAt(0);
            
            if (op<'1' || op>'4') {
                System.out.println("Opción inválida. Ingrese un entero de 1 a 4");
                System.out.println("Presione cualquier tecla para continuar...");
                input.nextLine();
                
                continue;
            } else {
                input.close();
                
                break;
            }
        } while (true);
        
        switch (op) {
            case '1':
                crearMiembro(TipoPersona.ALUMNO);                
            break;
            case '2':
                crearMiembro(TipoPersona.PROFESOR);                
            break;
            case '3':
                crearMiembro(TipoPersona.ADMINISTRATIVO);                
            break;
        }
    }
    
    public void crearMiembro(TipoPersona tipoPersona) {
        System.out.println("\nCREAR " + tipoPersona.name());
        
        int dayNac;
        int monthNac;
        int yearNac;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Nomebre: ");
        String nombre = input.nextLine();
        System.out.print("Apellido: ");
        String apellido = input.nextLine();
        
        do {
            try {
                System.out.print("Día de nacimiento: ");
                String strDayNac = input.nextLine();
                dayNac = Integer.parseInt(strDayNac);
                if (dayNac<1 || dayNac>31) {
                    mostrarMensaje("Error en el día de nacimiento.\nIntente nuevamente");
                    
                    continue;
                }
            } catch (Exception ex) {
                mostrarMensaje("Error en el día de nacimiento.\nIntente nuevamente");
                
                continue;
            }
            
            break;                    
        } while (true);
        
        do {
            try {
                System.out.print("Mes de nacimiento: ");
                String strMonthNac = input.nextLine();
                monthNac = Integer.parseInt(strMonthNac);
                if (monthNac<1 || monthNac>12) {
                    mostrarMensaje("Error en el mes de nacimiento.\nIntente nuevamente");
                    
                    continue;
                }
            } catch (Exception ex) {
                mostrarMensaje("Error en el mes de nacimiento.\nIntente nuevamente");
                
                continue;
            }
            
            break;                    
        } while (true);
        
        do {
            try {
                System.out.print("Año de nacimiento: ");
                String strYearNac = input.nextLine();
                yearNac = Integer.parseInt(strYearNac);
                if (yearNac<1940 || yearNac>2025) {
                    mostrarMensaje("Error en el año de nacimiento.\nIntente nuevamente");
                    
                    continue;
                }
            } catch (Exception ex) {
                mostrarMensaje("Error en el año de nacimiento.\nIntente nuevamente");
                
                continue;
            }
            
            break;                    
        } while (true);
        
        input.close();        
        
        Persona p = null;
        
        switch (tipoPersona) {
            case ALUMNO:
                p = new Estudiante(nombre, apellido, new Fecha(dayNac, monthNac, yearNac));
            break;
            case PROFESOR:
                p = new Profesor(nombre, apellido, new Fecha(dayNac, monthNac, yearNac));
            break;
            case ADMINISTRATIVO:
                p = new Administrativo(nombre, apellido, new Fecha(dayNac, monthNac, yearNac));
            break;
        }
        
        universidad.setPersona(p);
        mostrarMensaje("Listado de personas:\n" + universidad.getPersonas());
    }
}

class TestSistema {
    public static void main(String[] args) {
        Sistema universidad = new Sistema();
        
        universidad.ejecutar();
    }
}