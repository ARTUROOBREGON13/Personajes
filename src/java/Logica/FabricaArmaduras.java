/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Model.ArmaduraAbs;
import Model.ArmaduraElfo;
import Model.ArmaduraEnano;
import Model.ArmaduraHechicero;
import Model.ArmaduraHumano;

/**
 *
 * @author usuario
 */
public class FabricaArmaduras {

    public ArmaduraAbs crearArmaduraElfo() {
        return new ArmaduraElfo();
    }

    public ArmaduraAbs crearArmaduraEnano() {
        return new ArmaduraEnano();
    }

    ArmaduraAbs crearArmaduraHechicero() {
        return new ArmaduraHechicero();
    }

    ArmaduraAbs crearArmaduraHumano() {
        return new ArmaduraHumano();
    }

}
