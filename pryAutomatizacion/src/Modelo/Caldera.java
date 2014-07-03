/*
 * Clase caldera: Objeto de tipo Caldera.
 */
package Modelo;

/**
 * @author Dahiana Andrea Barreto
 * @author David Asaaf Vergara Almanza
 * @author Felipe Erazo Guerrero
 */
public class Caldera {

    private float temperatura;
    private boolean estado;

    public Caldera() {
    }

    /**
     * Constructor de Clase: Crea un objeto nuevo de tipo Caldera
     *
     * @param temperatura
     * @param estado
     */
    public Caldera(float temperatura, boolean estado) {
        this.temperatura = temperatura;
        this.estado = estado;
    }

    /**
     * Metodo getTemperatura: obtiene la temperatura.
     *
     * @return temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * Metodo setTemperatura. Modifica la temperatura.
     *
     * @param temperatura valor de la temperatura a modificar.
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Metodo isEstado: Obtiene el estado de la caldera.
     *
     * @return el estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Metodo setEstado: Modifica el estado de la caldera.
     *
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
