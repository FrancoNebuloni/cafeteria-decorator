package infusiones;

public class Te_Limon implements IInfusion {
    @Override
    public String getNombre() {
        return "Te de Limon";
    }

    @Override
    public Double getCosto() {
        return 1.8;
    }
}
