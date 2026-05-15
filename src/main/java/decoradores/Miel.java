package decoradores;

import infusiones.IInfusion;

public class Miel extends IngredienteDecorator{

    public Miel(IInfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.8;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Miel";
    }

}
