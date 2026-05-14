package excepciones;

public class InfusionNulaException extends RuntimeException {

    public InfusionNulaException() {
        super("La infusión no puede ser nula");
    }
    
}
