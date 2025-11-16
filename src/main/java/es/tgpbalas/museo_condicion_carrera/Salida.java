package es.tgpbalas.museo_condicion_carrera;

public class Salida extends Thread {

    private final Sala sala;

    public Salida(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.decrementar();
    }
}
