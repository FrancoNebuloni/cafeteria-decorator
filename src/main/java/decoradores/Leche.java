package decoradores;

import infusiones.IInfusion;

public class Leche extends IngredienteDecorator{

    public Leche(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 1.0;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Leche";
    }

}
