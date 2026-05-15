package decoradores;

import infusiones.IInfusion;

public class Menta extends IngredienteDecorator{

    public Menta(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.0;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Menta";
    }

}
