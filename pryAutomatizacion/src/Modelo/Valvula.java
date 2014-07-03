/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * @author Dahiana Andrea Barreto
 * @author David Asaaf Vergara Almanza
 * @author Felipe Erazo Guerrero
 */
public class Valvula {
    
    private float apertura;
    private float caudal;

    public Valvula() {
    }

    public Valvula(float apertura, float caudal) {
        this.apertura = apertura;
        this.caudal = caudal;
    }

    /**
     * @return the apertura
     */
    public float getApertura() {
        return apertura;
    }

    /**
     * @param apertura the apertura to set
     */
    public void setApertura(float apertura) {
        this.apertura = apertura;
    }

    /**
     * @return the caudal
     */
    public float getCaudal() {
        return caudal;
    }

    /**
     * @param caudal the caudal to set
     */
    public void setCaudal(float caudal) {
        this.caudal = caudal;
    }
    
    
    
}
