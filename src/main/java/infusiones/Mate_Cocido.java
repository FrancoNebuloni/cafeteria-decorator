package infusiones;

public class Mate_Cocido implements IInfusion{
    @Override
    public String getNombre() {
        return "Mate Cocido";
    }

    @Override
    public Double getCosto() {
        return 2.4;
    }
}
