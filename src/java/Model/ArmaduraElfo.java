/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author konan
 */
public class ArmaduraElfo extends ArmaduraAbs {

    @Override
    public ArmaduraAbs Clonar() {
        ArmaduraAbs clon = new ArmaduraElfo();
        return clon;
    }

}
