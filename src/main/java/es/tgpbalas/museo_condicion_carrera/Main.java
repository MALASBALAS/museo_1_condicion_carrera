package es.tgpbalas.museo_condicion_carrera;

public class Main {
    
    // En mis pruebas he puesto totales altos para ver la condicion de carrera
    private static final int TOTAL_ENTRADAS = 10;
    private static final int TOTAL_SALIDAS = 15;
    private static final int TIEMPO_ESPERA = 100;

    public static void main(String[] args) throws InterruptedException {

        Sala sala = new Sala();

        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            Thread entrada = new Thread(new Entrada(sala));
            entrada.start();
        }

        for (int i = 0; i < TOTAL_SALIDAS; i++) {
            Thread salida = new Thread(new Salida(sala));
            salida.start();
        }

        Thread.sleep(TIEMPO_ESPERA);

        System.out.println(sala.aforo);


    }
}