package Logica;

import Model.Arco;
import Model.ArmaduraElfo;
import Model.EscudoDorado;
import Model.Lobo;
import Model.Personaje;

/**
 *
 * @author konan
 */
public class FabricaElfos extends FabricaAbs{

    
    FabricaElfos() {
        
    }

    @Override
    protected void crearEscudo() {
        escudo = new EscudoDorado();
    }

    @Override
    protected void crearArma() {
        arma = new Arco();
    }

    @Override
    protected void crearMontura() {
        montura = new Lobo();
    }

    @Override
    protected void crearArmadura() {
        armadura = new ArmaduraElfo();
    }

    @Override
    public Personaje crearPersonaje() {
        return new Personaje("Elfo", arma, armadura, escudo, montura);
    }
    
}
