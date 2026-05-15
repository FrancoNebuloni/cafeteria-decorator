package infusiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import decoradores.*;
import excepciones.InfusionNulaException;

public class CafeteriaTest {
    @Test 
    void cafeConLecheSale4() {
        IInfusion cafeConLeche = new Leche(new Cafe());
        assertEquals(4.0, cafeConLeche.getCosto());
    }

    @Test
    void cafeConLecheSeMuestraComoCafe_Con_Leche() {
        IInfusion cafeConLeche = new Leche(new Cafe());
        assertEquals("Cafe con Leche", cafeConLeche.getNombre());
    }

    @Test
    void cafeConLecheYCanelaSeMuestraComoCafe_Con_Leche_Y_Canela() {
        IInfusion cafeConLecheYCanela = new Canela (new Leche(new Cafe()));
        assertEquals("Cafe con Leche con Canela", cafeConLecheYCanela.getNombre());
    }

    @Test
    void lanzaExcepcionSiSeCreaUnaInfusionDecoradaConDecoradorNulo() {
        assertThrows(InfusionNulaException.class, 
            () -> new Leche(null)
        );
    }
}
