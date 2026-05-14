package decoradores;

import infusiones.IInfusion;

public class Chocolate_Extra extends IngredienteDecorator{
    protected Chocolate_Extra(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 2.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Chocolate Extra";
    }
}
