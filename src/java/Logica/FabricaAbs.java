/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Model.ArmaAbs;
import Model.ArmaduraAbs;
import Model.EscudoAbs;
import Model.MonturaAbs;
import Model.Personaje;

/**
 *
 * @author konan
 */
public abstract class FabricaAbs {
 
    protected ArmaAbs arma;
    protected ArmaduraAbs armadura;
    protected EscudoAbs escudo;
    protected MonturaAbs montura;
   
    protected abstract void crearEscudo();
    
    protected abstract void crearArma();
    
    protected abstract void crearMontura();
    
    protected abstract void crearArmadura();

    public ArmaAbs getArma() {
        return arma;
    }

    public ArmaduraAbs getArmadura() {
        return armadura;
    }

    public EscudoAbs getEscudo() {
        return escudo;
    }

    public MonturaAbs getMontura() {
        return montura;
    }

    public abstract Personaje crearPersonaje();

    
}
