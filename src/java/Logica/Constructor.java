/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Model.Ejercito;
import Model.Personaje;

/**
 *
 * @author usuario
 */
public class Constructor {

    private static FabricaArmas fabricaArmas;
    private static FabricaArmaduras fabricaArmaduras;
    private static FabricaEscudos fabricaEscudos;
    private static FabricaMonturas fabricaMonturas;
    private static Personaje prototipo;
    private static Ejercito tropas;

    public static void crearPersonaje(String tipo) {
        prototipo = new Personaje(tipo);
    }

    /**
     * @return the pj
     */
    public static Personaje getPj() {
        return prototipo;
    }

    static void construirPersonaje(String tipo, boolean rArma, boolean rArmadura, boolean rEscudo, boolean rMontura) {
        //Verificacion de existencia de fabricas.
        if (fabricaArmas == null) {
            fabricaArmas = new FabricaArmas();
        }
        if (fabricaArmaduras == null) {
            fabricaArmaduras = new FabricaArmaduras();
        }
        if (fabricaEscudos == null) {
            fabricaEscudos = new FabricaEscudos();
        }
        if (fabricaMonturas == null) {
            fabricaMonturas = new FabricaMonturas();
        }

        prototipo = new Personaje(tipo);

        if (rArma) {
            if (tipo == "Elfo") {
                prototipo.setArma(fabricaArmas.crearArco());
            } else if (tipo == "Enano") {
                prototipo.setArma(fabricaArmas.crearMartillo());

            } else if (tipo == "Hechicero") {
                prototipo.setArma(fabricaArmas.crearLibro());

            } else if (tipo == "Humano") {
                prototipo.setArma(fabricaArmas.crearEspada());
            }
        }
        if (rArmadura) {
            if (tipo == "Elfo") {
                prototipo.setArmadura(fabricaArmaduras.crearArmaduraElfo());
            } else if (tipo == "Enano") {
                prototipo.setArmadura(fabricaArmaduras.crearArmaduraEnano());

            } else if (tipo == "Hechicero") {
                prototipo.setArmadura(fabricaArmaduras.crearArmaduraHechicero());

            } else if (tipo == "Humano") {
                prototipo.setArmadura(fabricaArmaduras.crearArmaduraHumano());
            }
        }
        if (rEscudo) {
            if (tipo == "Elfo") {
                prototipo.setEscudo(fabricaEscudos.crearEscudoDorado());
            } else if (tipo == "Enano") {
                prototipo.setEscudo(fabricaEscudos.crearEscudoRedondo());

            } else if (tipo == "Hechicero") {
                prototipo.setEscudo(fabricaEscudos.crearEscudoEtereo());

            } else if (tipo == "Humano") {
                prototipo.setEscudo(fabricaEscudos.crearEscudoAcero());
            }
        }
        if (rMontura) {

            if (tipo == "Elfo") {
                prototipo.setMontura(fabricaMonturas.crearLobo());
            } else if (tipo == "Enano") {
                prototipo.setMontura(fabricaMonturas.crearJabali());

            } else if (tipo == "Hechicero") {
                prototipo.setMontura(fabricaMonturas.crearGrifo());

            } else if (tipo == "Humano") {
                prototipo.setMontura(fabricaMonturas.crearCaballo());
            }
        }
    }

    public static Ejercito getTropas() {
        if (tropas == null) {
            tropas = Ejercito.getEjercito();
        }
        return tropas;
    }
    
    public static void addTropas(int cantidad){
        getTropas().addTropas(prototipo, cantidad);
    }
}
