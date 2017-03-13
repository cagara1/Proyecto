package museo;

import java.util.concurrent.Semaphore;

/**
 * Clase museo que tiene los metodos para ir trabajando con los clientes.
 *
 * @author Carlos Garrobo Raya
 * @version 15/12/2016
 */
public class museo {

    public static boolean salaespera, exposicion;
    static Semaphore semaphore = new Semaphore(1);
    /**
     * Constucor de la clase museo
     */
    public museo() {

    }

    /**
     * Metodo que indica la entrada del cliente al museo.
     */
    public synchronized void entradaCliente() {
        System.out.println("El " + Thread.currentThread().getName().toString() + " llega a la cola");
        try {
            semaphore.release(122);
        } catch (Exception ex) {
            System.out.println("");
        }
    }

    /**
     * Metodo que indica cuando entra a sala de epera.
     */
    public synchronized void entradasalaespera() {
        if (!salaespera) {
            salaespera = true;
            System.out.println("El " + Thread.currentThread().getName().toString() + " entra a la sala de espera.");
            //notify();
            try {
                semaphore.release();
            } catch (Exception ex) {
                System.out.println("");
            }
        } else {
            try {
                //wait();
                semaphore.acquire();
            } catch (InterruptedException ex) {
                System.out.println("Error en el wait del cliente");
            }
        }
    }

    /**
     * Metodo que indica la entrada a la sala de exposicion.
     */
    public synchronized void entradaexposicion() {
        if (!exposicion) {
            exposicion = true;
            salaespera = false;
            System.out.println("El " + Thread.currentThread().getName().toString() + " entra a la exposicion.");
            try {
                semaphore.release();
            } catch (Exception ex) {
                System.out.println("");
            }
            //notify();
        } else {
            try {

                //wait();
                semaphore.acquire();
            } catch (InterruptedException ex) {
                System.out.println("Error en el wait del cliente");
            }
        }
    }

    /**
     * Metodo que indica que el cliente sale.
     */
    public synchronized void salidacliente() {
        exposicion = false;
        try {
            Thread.sleep(1000 + (int) (Math.random() * 3000));
            semaphore.release();
            //notify();
        } catch (InterruptedException ex) {
            System.out.println("Error en la salida del cliente");
        }
        System.out.println("El " + Thread.currentThread().getName().toString() + " se va.");
    }
    
 
            
}
