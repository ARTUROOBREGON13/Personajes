package Logica;

import Model.ArmaduraHumano;
import Model.*;

/**
 *
 * @author konan
 */
public class FabricaHumanos extends FabricaAbs {

    @Override
    protected void crearEscudo() {
        escudo = new EscudoAcero();
    }

    @Override
    protected void crearArma() {
        arma = new Espada();
    }

    @Override
    protected void crearMontura() {
        montura = new Caballo();
    }

    @Override
    protected void crearArmadura() {
        armadura = new ArmaduraHumano();
    }

    @Override
    public Personaje crearPersonaje() {
        return new Personaje("Humano", arma, armadura, escudo, montura);
    }
}
