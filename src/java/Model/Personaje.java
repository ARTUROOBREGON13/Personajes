package Model;

public class Personaje {
    
    private ArmaAbs arma;
    private ArmaduraAbs armadura;
    private EscudoAbs escudo;
    private MonturaAbs montura;
    private String tipo;    
    
    public Personaje(){
        
    }

    public Personaje(String tipo, ArmaAbs arma, ArmaduraAbs armadura, EscudoAbs escudo, MonturaAbs montura) {
        
        setTipo(tipo);
        setArma(arma);
        setArmadura(armadura);
        setEscudo(escudo);
        setMontura(montura);
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

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
}
