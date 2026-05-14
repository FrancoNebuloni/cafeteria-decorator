package infusiones;

public class Te implements IInfusion{
    @Override
    public String getNombre() {
        return "Te";
    }

    @Override
    public Double getCosto() {
        return 2.0;
    }
}
