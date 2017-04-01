/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Model.Arco;
import Model.Espada;
import Model.Libro;
import Model.Martillo;

public class FabricaArmas {

    public Arco crearArco() {
        return new Arco();
    }

    public Espada crearEspada() {
        return new Espada();
    }

    public Martillo crearMartillo() {
        return new Martillo();
    }

    public Libro crearLibro() {
        return new Libro();
    }
    
     
}
