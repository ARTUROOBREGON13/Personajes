package Logica;

import Model.Caballo;
import Model.Grifo;
import Model.Jabali;
import Model.Lobo;
import Model.MonturaAbs;

/**
 *
 * @author usuario
 */
public class FabricaMonturas {

    MonturaAbs crearLobo() {
        return new Lobo();
    }

    MonturaAbs crearJabali() {
        return new Jabali();
    }

    MonturaAbs crearGrifo() {

        return new Grifo();
    }

    MonturaAbs crearCaballo() {

        return new Caballo();
    }

}
