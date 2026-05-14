package infusiones;

public class Cafe implements IInfusion {
    @Override
    public String getNombre() {
        return "Cafe";
    }

    @Override
    public Double getCosto() {
        return 3.0;
    }
}
