/*
 * Clase registro.
 */
package Modelo;

/**
 * @author Dahiana Andrea Barreto
 * @author David Asaaf Vergara Almanza
 * @author Felipe Erazo Guerrero
 */
public class Registro {

    private String temperatura;
    private String nivelTanque;
    private String caudal_q1;
    private String caudal_q2;
    private String fecha;

    public Registro() {
    }

    /**
     * Constructor de Clase: Crea un nuevo registro
     *
     * @param temperatura
     * @param nivelTanque
     * @param caudal_q1
     * @param caudal_q2
     * @param fecha
     */
    public Registro(String temperatura, String nivelTanque, String caudal_q1, String caudal_q2, String fecha) {
        this.temperatura = temperatura;
        this.nivelTanque = nivelTanque;
        this.caudal_q1 = caudal_q1;
        this.caudal_q2 = caudal_q2;
        this.fecha = fecha;
    }

    /**
     * Metodo getTemperatura: Obtiene la temperatura en el registro.
     *
     * @return la temperatura
     */
    public String getTemperatura() {
        return temperatura;
    }

    /**
     * Metodo setTemparutura: Modifica la temperatura en el registro
     *
     * @param temperatura. Nuevo valor de la temperatura a ser modificado.
     */
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Metodo getNivelTanque: Obtiene el valor del nivel del tanque en el
     * registro.
     *
     * @return el nivelTanque
     */
    public String getNivelTanque() {
        return nivelTanque;
    }

    /**
     * Metodo setNivelTanque: Modifica el valor del nivel del tanque en el
     * registro.
     *
     * @param nivelTanque nuevo valor de nivel para el tanque.
     */
    public void setNivelTanque(String nivelTanque) {
        this.nivelTanque = nivelTanque;
    }

    /**
     * Metodo setCaudal_q1: Obtiene el valor del caudal en q1.
     *
     * @return caudal_q1
     */
    public String getCaudal_q1() {
        return caudal_q1;
    }

    /**
     * Metodo setCaudal_q1: Modifica el caudal de q1 en el registro.
     *
     * @param caudal_q1 nuevo valor para el caudal en q1
     */
    public void setCaudal_q1(String caudal_q1) {
        this.caudal_q1 = caudal_q1;
    }

    /**
     * Metodo getCaudal_q2: Obtiene el caudal para q2 en el registro.
     *
     * @return caudal_q2
     */
    public String getCaudal_q2() {
        return caudal_q2;
    }

    /**
     * Metodo setCaudal_q2: Modifica el caudal para q2 en el registro.
     *
     * @param caudal_q2 nuevo valor de q2 a modificar en el registro.
     */
    public void setCaudal_q2(String caudal_q2) {
        this.caudal_q2 = caudal_q2;
    }

    /**
     * Metodo getFecha: Obtiene la fecha
     *
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Metodo setFecha: Modifica la fecha
     *
     * @param fecha valor de fecha a modificar
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
