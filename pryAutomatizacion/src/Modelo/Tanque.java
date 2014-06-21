/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Usuario
 */
public class Tanque {
    
    private float nivel;
    private float temperatura;
    private int volumen;

    public Tanque() {
    }

    public Tanque(float nivel, float temperatura, int volumen) {
        this.nivel = nivel;
        this.temperatura = temperatura;
        this.volumen = volumen;
    }

    /**
     * @return the nivel
     */
    public float getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(float nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the volumen
     */
    public int getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    
}
