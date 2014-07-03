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
public class Registro {
 
    private String temperatura;
    private String nivelTanque;
    private String caudal_q1;
    private String caudal_q2;
    private String fecha;

    public Registro() {
    }

    public Registro(String temperatura, String nivelTanque, String caudal_q1, String caudal_q2, String fecha) {
        this.temperatura = temperatura;
        this.nivelTanque = nivelTanque;
        this.caudal_q1 = caudal_q1;
        this.caudal_q2 = caudal_q2;
        this.fecha = fecha;
    }

    /**
     * @return the temperatura
     */
    public String getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the nivelTanque
     */
    public String getNivelTanque() {
        return nivelTanque;
    }

    /**
     * @param nivelTanque the nivelTanque to set
     */
    public void setNivelTanque(String nivelTanque) {
        this.nivelTanque = nivelTanque;
    }

    /**
     * @return the caudal_q1
     */
    public String getCaudal_q1() {
        return caudal_q1;
    }

    /**
     * @param caudal_q1 the caudal_q1 to set
     */
    public void setCaudal_q1(String caudal_q1) {
        this.caudal_q1 = caudal_q1;
    }

    /**
     * @return the caudal_q2
     */
    public String getCaudal_q2() {
        return caudal_q2;
    }

    /**
     * @param caudal_q2 the caudal_q2 to set
     */
    public void setCaudal_q2(String caudal_q2) {
        this.caudal_q2 = caudal_q2;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
