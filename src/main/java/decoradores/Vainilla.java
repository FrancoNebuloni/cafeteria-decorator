package decoradores;

import infusiones.IInfusion;

public class Vainilla extends IngredienteDecorator{

    public Vainilla(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.7;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Vainilla";
    }

}
