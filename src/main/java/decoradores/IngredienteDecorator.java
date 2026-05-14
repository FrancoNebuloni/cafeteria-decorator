package decoradores;

import excepciones.InfusionNulaException;
import infusiones.IInfusion;

/* Las clases abstractas se usan cuando tenés atributos, Interfaces solo cuando
Se usan métodos! */

public abstract class IngredienteDecorator implements IInfusion{
    private final IInfusion infusion;

    protected IngredienteDecorator(IInfusion infusion) {
        if (infusion == null) {
            throw new InfusionNulaException();
        }
        this.infusion = infusion;
    }

    @Override
    public Double getCosto() {
        return infusion.getCosto() + getCostoExtra();
    }

    @Override
    public String getNombre() {
        return infusion.getNombre() + "con" + getNombreIngrediente();
    }

    protected abstract Double getCostoExtra();
    protected abstract String getNombreIngrediente();
    
}
