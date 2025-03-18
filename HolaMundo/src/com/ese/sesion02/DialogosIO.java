package com.ese.sesion02;

import javax.swing.JOptionPane;
        
/**
 *
 * @author camper
 */
public class DialogosIO {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor real"));
        JOptionPane.showMessageDialog(null,
                "El valor ingresado fue: " + num1,
                "Mensaje de salida",
                JOptionPane.INFORMATION_MESSAGE);
    }
}