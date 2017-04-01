/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author R2D2
 */
public class Piedra extends Material {

    public Piedra() {
        aumentoDano=2;
    }

    @Override
    public int getDano() {
        return aumentoDano;
    }
    
}
