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
public class Constructor {

    private static FabricaArmas fabricaArmas;
    private static FabricaArmaduras fabricaArmaduras;
    private static FabricaEscudos fabricaEscudos;
    private static FabricaMonturas fabricaMonturas;
    private static Personaje pj;

    public static void crearPersonaje(String tipo) {
        pj = new Personaje(tipo);
    }

    /**
     * @return the pj
     */
    public static Personaje getPj() {
        return pj;
    }

    static void construirPersonaje(String tipo, boolean rArma, boolean rArmadura, boolean rEscudo, boolean rMontura) {
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

        pj = new Personaje(tipo);

        if (rArma) {
            if (tipo == "Elfo") {
                pj.setArma(fabricaArmas.crearArco());
            } else if (tipo == "Enano") {
                pj.setArma(fabricaArmas.crearMartillo());

            } else if (tipo == "Hechicero") {
                pj.setArma(fabricaArmas.crearLibro());

            } else if (tipo == "Humano") {
                pj.setArma(fabricaArmas.crearEspada());
            }
        }
        if (rArmadura) {
            if (tipo == "Elfo") {
                pj.setArmadura(fabricaArmaduras.crearArmaduraElfo());
            } else if (tipo == "Enano") {
                pj.setArmadura(fabricaArmaduras.crearArmaduraEnano());

            } else if (tipo == "Hechicero") {
                pj.setArmadura(fabricaArmaduras.crearArmaduraHechicero());

            } else if (tipo == "Humano") {
                pj.setArmadura(fabricaArmaduras.crearArmaduraHumano());
            }
        }
        if (rEscudo) {
            if (tipo == "Elfo") {
                pj.setEscudo(fabricaEscudos.crearEscudoDorado());
            } else if (tipo == "Enano") {
                pj.setEscudo(fabricaEscudos.crearEscudoRedondo());

            } else if (tipo == "Hechicero") {
                pj.setEscudo(fabricaEscudos.crearEscudoEtereo());

            } else if (tipo == "Humano") {
                pj.setEscudo(fabricaEscudos.crearEscudoAcero());
            }
        }
        if (rMontura) {
            
            if (tipo == "Elfo") {
                pj.setMontura(fabricaMonturas.crearLobo());
            } else if (tipo == "Enano") {
                pj.setMontura(fabricaMonturas.crearJabali());

            } else if (tipo == "Hechicero") {
                pj.setMontura(fabricaMonturas.crearGrifo());

            } else if (tipo == "Humano") {
                pj.setMontura(fabricaMonturas.crearCaballo());
            }
        }
    }

}
