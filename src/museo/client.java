package museo;

/**
 * Clase cliente que inicializa a los clientes.
 *
 * @author Carlos Garrobo Raya
 * @version 15/12/2016
 */
public class client extends Thread {

    private final museo museos;
    int numerocliente = 0;
    int totalclientes = 1000;
    /**
     * Constuctor de cliente.
     * @param museo Es el parametro del museo donde asisten
     * @param numero  Es el numero del cliente.
     */
    public client(museo museo, int numero) {
        this.museos = museo;
        this.numerocliente = numero;
    }

    /**
     * Metodo que arranca a nuestro cliente.
     */
    @Override
    public void run() {
        numerocliente++;
        currentThread().setName("Cliente " + numerocliente);
        museos.entradaCliente();

        museos.entradasalaespera();
        museos.entradaexposicion();
        museos.salidacliente();

    }
}
