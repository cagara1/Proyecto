
package ComprovarValors;
import java.util.Scanner;
/**
 * Clase que controla la introduccion de datos.
 *
 * @author Carlos Garrobo Raya
 * @version 15/12/2016
 */
public class EntradaDeDades {
     
    /**
     * Es el controlador dels sencers, detecta si hem entrat un sencer o no
     * @return: retorna el valor introduit.
     */
    public static int Sencer() {
       Scanner lector=new Scanner(System.in);
        int numero = 0;
        boolean correcte;
        
        do{
            correcte=lector.hasNextInt();
            if(!correcte){
                System.out.print("El numero introduit no es un enter\n");
                lector.nextLine();
            }else if(numero<0){
                System.out.print("El numero introduit es inferior a 0");
            }          
        }while (!correcte);
        numero=lector.nextInt();
        
        return numero;
        
    }
    /**
     * Es el controlador dels double, detecta si hem entrat un double o no
     * @return: retorna el valor introduit.
     */
    public static double numerosdecimales() {
       Scanner lector=new Scanner(System.in);
        double numero = 0;
        boolean correcte;
        
        do{
            correcte=lector.hasNextDouble();
            if(!correcte){
                System.out.print("El numero introduit no es un enter\n");
                lector.nextLine();
            }else if(numero<0){
                System.out.print("El numero introduit es inferior a 0");
            }          
        }while (!correcte);
        numero=lector.nextDouble();
        
        return numero;
        
    }
    /**
     * Es el controlador dels char, detecta si hem entrat un char o no i que no sigui un numero.
     * @return: retorna el valor introduit.
     */
    public static char caracteres() {
       Scanner lector=new Scanner(System.in);
        boolean correcte=false;
            String caracter;
            char letra;
        do{
            caracter=lector.next();
            if(caracter.length() == 1){
                letra=caracter.charAt(0);
                if(letra != '1' & letra != '2' & letra != '3' & letra != '4' & letra != '5' & letra != '6' & letra != '7' & letra != '8' & letra != '9'){
                    correcte=true;
                }
                
            }
            if(!correcte){
                System.out.print("Solament pots introduir una lletra.\n");
                lector.nextLine();
            }        
            
        }while (!correcte);
        
        return caracter.charAt(0);
        
    }
}
