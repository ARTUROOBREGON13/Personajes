/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Model.ArmaduraHechicero;
import Model.Grifo;
import Model.Libro;
import Model.Personaje;

/**
 *
 * @author konan
 */
public class FabricaHechiceros extends FabricaAbs {

    public FabricaHechiceros() {

    }

    @Override
    protected void crearEscudo() {
        escudo = null;
    }

    @Override
    protected void crearArma() {
        arma = new Libro();
    }

    @Override
    protected void crearMontura() {
        montura = new Grifo();
    }

    @Override
    protected void crearArmadura() {
        armadura = new ArmaduraHechicero();
    }

    @Override
    public Personaje crearPersonaje() {
        return new Personaje("Hechicero", arma, armadura, escudo, montura);
    }
}
