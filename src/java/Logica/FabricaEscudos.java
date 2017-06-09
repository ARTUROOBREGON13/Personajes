/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Model.EscudoAbs;
import Model.EscudoAcero;
import Model.EscudoDorado;
import Model.EscudoEtereo;
import Model.EscudoRedondo;

/**
 *
 * @author usuario
 */
public class FabricaEscudos {

    EscudoAbs crearEscudoDorado() {
        return new EscudoDorado();
    }

    EscudoAbs crearEscudoRedondo() {
        return new EscudoRedondo();
    }

    EscudoAbs crearEscudoEtereo() {
        return new EscudoEtereo();
    }

    EscudoAbs crearEscudoAcero() {
        return new EscudoAcero();
    }

}
