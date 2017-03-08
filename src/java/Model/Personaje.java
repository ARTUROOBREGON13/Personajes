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
public class Personaje {

    private ArmaAbs arma;
    private ArmaduraAbs armadura;
    private EscudoAbs escudo;
    private MonturaAbs montura;
    private String tipo;

    public Personaje() {

    }

    public Personaje(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the arma
     */
    public ArmaAbs getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(ArmaAbs arma) {
        this.arma = arma;
    }

    /**
     * @return the armadura
     */
    public ArmaduraAbs getArmadura() {
        return armadura;
    }

    /**
     * @param armadura the armadura to set
     */
    public void setArmadura(ArmaduraAbs armadura) {
        this.armadura = armadura;
    }

    /**
     * @return the escudo
     */
    public EscudoAbs getEscudo() {
        return escudo;
    }

    /**
     * @param escudo the escudo to set
     */
    public void setEscudo(EscudoAbs escudo) {
        this.escudo = escudo;
    }

    /**
     * @return the montura
     */
    public MonturaAbs getMontura() {
        return montura;
    }

    /**
     * @param montura the montura to set
     */
    public void setMontura(MonturaAbs montura) {
        this.montura = montura;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

}
