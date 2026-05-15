package decoradores;

import infusiones.IInfusion;

public class Boldo extends IngredienteDecorator{

    public Boldo(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.0;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Boldo";
    }

}
