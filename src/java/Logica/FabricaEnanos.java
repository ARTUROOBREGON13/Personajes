
package Logica;

import Model.ArmaduraEnano;
import Model.Jabali;
import Model.EscudoRedondo;
import Model.Martillo;
import Model.Personaje;

/**
 *
 * @author konan
 */
public class FabricaEnanos extends FabricaAbs{

    
    @Override
    protected void crearEscudo() {
        escudo = new EscudoRedondo();
    }

    @Override
    protected void crearArma() {
        arma = new Martillo();
    }

    @Override
    protected void crearMontura() {
        montura = new Jabali();
    }

    @Override
    protected void crearArmadura() {
        armadura = new ArmaduraEnano();
    }

    @Override
    
    public Personaje crearPersonaje() {
        return new Personaje("Enano", arma, armadura, escudo, montura);
    }
}
