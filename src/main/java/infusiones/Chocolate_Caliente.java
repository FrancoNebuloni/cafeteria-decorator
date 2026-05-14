package infusiones;

public class Chocolate_Caliente implements IInfusion{
    @Override
    public String getNombre() {
        return "Chocolate Caliente";
    }

    @Override
    public Double getCosto() {
        return 4.0;
    }
}
