package infusiones;

public class Te_Hierbas implements IInfusion {
    @Override
    public String getNombre() {
        return "Te de Hierbas";
    }

    @Override
    public Double getCosto() {
        return 1.5;
    }

}
