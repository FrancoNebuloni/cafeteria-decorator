package decoradores;

import infusiones.IInfusion;

public class Crema extends IngredienteDecorator{
    public Crema(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 1.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Crema";
    }
}
