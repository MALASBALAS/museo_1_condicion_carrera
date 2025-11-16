package es.tgpbalas.museo_condicion_carrera;

public class Sala {
    private static final int AFORO_PERSONAS = 100;
    private static final int SUMA_RESTA = 1;
    
    int aforo = AFORO_PERSONAS;
    
    
    public void incrementar(){
        aforo = aforo + SUMA_RESTA;
    }
    
    
    public void decrementar(){
        aforo = aforo - SUMA_RESTA;
    }


}