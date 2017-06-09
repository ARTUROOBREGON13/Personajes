package Model;

import java.util.ArrayList;

/**
 *
 * @author R2D2
 */
public class Ejercito {

    private static Ejercito ejercito;
    private ArrayList<Personaje> tropas;

    public static Ejercito getEjercito() {
        if (ejercito == null) {
            ejercito = new Ejercito();
        }
        return ejercito;
    }

    public String listarTropas() {
        String lista = "";
        int i = 1;
        if (tropas != null || !tropas.isEmpty()) {
            for (Personaje p : tropas) {
                lista += i + " " + p.getTipo() + "\n";
            }
        }
        return lista;
    }

    public void addTropas(Personaje p, int cantidad) {
        if (tropas == null) {
            tropas = new ArrayList<Personaje>();
        }
        for (int i = 0; i < cantidad; i++) {
            tropas.add(p.Clonar());
        }
    }
}
