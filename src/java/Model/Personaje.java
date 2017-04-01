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
public class Personaje implements Clonable {

    private ArmaAbs arma;
    private ArmaduraAbs armadura;
    private EscudoAbs escudo;
    private MonturaAbs montura;
    private String tipo;
    

    public Personaje(String tipo, ArmaAbs arma, ArmaduraAbs armadura, EscudoAbs escudo, MonturaAbs montura) {
        this.tipo = tipo;
        this.arma = arma;
        this.armadura = armadura;
        this.escudo = escudo;
        this.montura = montura;
    }

    public Personaje(String tipo) {
        this.tipo = tipo;
    }

    private Personaje() {
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

    @Override
    public Object clonar() {
        Personaje clonado;
        clonado = new Personaje();
        clonado.tipo = tipo;
        if(arma!=null)
        clonado.arma = (ArmaAbs) arma.clonar();
        if(armadura!=null)
        clonado.armadura = (ArmaduraAbs) armadura.clonar();
        if(escudo!=null)
        clonado.escudo = (EscudoAbs) escudo.clonar();
        if(montura!=null)
        clonado.montura = (MonturaAbs) montura.clonar();

        return clonado;
    }

}
