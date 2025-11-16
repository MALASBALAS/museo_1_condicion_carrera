package es.tgpbalas.museo_condicion_carrera;

public class Entrada extends Thread {

    private final Sala sala;

    public Entrada(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.incrementar();
    }
}    
