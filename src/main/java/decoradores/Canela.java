package decoradores;

import infusiones.IInfusion;

public class Canela extends IngredienteDecorator{

    protected Canela(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Canela";
    }

}
