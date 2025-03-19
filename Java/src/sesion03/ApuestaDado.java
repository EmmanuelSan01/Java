package sesion03;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class ApuestaDado {
    public static void main(String[] args) {
        int bet;
        int dice;
        
        do {
            System.out.println("¿Qué número saldrá en el dado?");
            Scanner scn  = new Scanner(System.in);
            bet = Integer.parseInt(scn.nextLine()); // .charAt(0)
        } while(bet<1 || bet>6);
        
        dice = (int)(Math.random()*6+1);
	System.out.print("El dado arrojó un " + dice);
        if(bet != dice) {
            System.out.println(" Acaba de perder $1.00");
        } else {
            System.out.println(" Acaba de ganar $5.00");
        }
    }
}