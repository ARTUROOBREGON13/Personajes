/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author konan
 */
public abstract class EscudoAbs implements Clonable{
    @Override
    public Object clonar() {
        try {
            return this.getClass().newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(ArmaduraAbs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ArmaduraAbs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
