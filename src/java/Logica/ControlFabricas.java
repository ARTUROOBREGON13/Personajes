/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Model.Personaje;

/**
 *
 * @author usuario
 */
public class ControlFabricas {
    private static FabricaAbs fabrica;
    private static Personaje pj;
    
    /**
     * @return the fabrica
     */
    public static FabricaAbs getFabrica() {
        return fabrica;
    }
    

    public static void setFabrica(FabricaAbs fabrica) {
        ControlFabricas.fabrica = fabrica;
    }
    
    public static void crearPersonaje(){
        pj = fabrica.crearPersonaje();
    }

    /**
     * @return the pj
     */
    public static Personaje getPj() {
        return pj;
    }
    
    
}
