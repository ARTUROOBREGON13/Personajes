/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author usuario
 */
public class EscudoEtereo extends EscudoAbs {

    @Override
    public EscudoAbs Clonar() {
        EscudoAbs clon = new EscudoEtereo();
        return clon;
    }
}
