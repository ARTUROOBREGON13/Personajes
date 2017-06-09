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
public class ArmaduraHumano extends ArmaduraAbs{
    @Override
    public ArmaduraAbs Clonar() {
        ArmaduraAbs clon = new ArmaduraHumano();
        return clon;
    }
}
