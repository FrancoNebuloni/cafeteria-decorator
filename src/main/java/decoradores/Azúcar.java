package decoradores;

import infusiones.IInfusion;

public class Azúcar extends IngredienteDecorator{

    public Azúcar(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Azúcar";
    }

}
