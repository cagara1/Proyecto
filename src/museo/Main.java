/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import ComprovarValors.EntradaDeDades;
import java.util.Scanner;

/**
 *
 * @author Carlos Garrobo Raya
 * @version 15/12/2016
 */
public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("Indica cuantos visitante quieres.");
            int visitantes = EntradaDeDades.Sencer();
            museo museo = new museo();
            for (int x = 0; x < visitantes; x++) {
                client cliente = new client(museo,x);
                cliente.start();
            }
        } catch (Exception ex) {
            System.out.println("Error en el main");
        }
    }
}
asd