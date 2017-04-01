/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author konan
 */
public abstract class ArmaAbs implements Clonable {

    public ArrayList<Material> materialesArma;
    protected int dano;

    public int getDano() {
        int danoAumentado = 0;
        for (Material material : materialesArma) {
            danoAumentado += material.getDano();
        }
        return danoAumentado + dano;
    }

    @Override
    public ArmaAbs clonar() {
        try {
            ArmaAbs clon = this.getClass().newInstance();
            for (Material material : materialesArma) {
                clon.materialesArma.add(material);
            }
            return clon;
        } catch (Exception ex) {
        }
        return null;
    }

    public void mejorarArma(Material m) {
        boolean aplicado = false;
        for (Material material : materialesArma) {
            if (material.equals(m)) {
                aplicado = true;
                break;
            }
        }

        if (!aplicado) {
            materialesArma.add(m);
        }
    }
}
