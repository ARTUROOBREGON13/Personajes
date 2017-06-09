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
public class Grifo extends MonturaAbs{
    
    @Override
    public MonturaAbs Clonar() {
        MonturaAbs clon = new Grifo();
        return clon;
    }
}
