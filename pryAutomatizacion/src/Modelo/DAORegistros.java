/*
 * Clase DAORegistros. Encargada de realizar consultas e inserciones a la base de datos.
 */
package Modelo;

import Controlador.ControlBD;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dahiana Andrea Barreto
 * @author David Asaaf Vergara Almanza
 * @author Felipe Erazo Guerrero
 */
public class DAORegistros {

    ControlBD conn = new ControlBD();
    LinkedList<Registro> registros = new LinkedList<>();

    /**
     * Metodo Insertar
     *
     * @param temperatura
     * @param nivel
     * @param caudal_q1
     * @param caudal_q2
     * @return Error en caso de que no se realice correctamente la inserción a
     * la base de datos
     */
    public String insertar(String temperatura, String nivel, String caudal_q1, String caudal_q2) {
        String sql = "INSERT INTO registros (temperatura, nivel, caudal_q1, caudal_q2, fecha) VALUES ('" + temperatura + "','" + nivel + "','" + caudal_q1 + "','" + caudal_q2 + "',localtimestamp);";
        if (conn.actualizar(sql) == 1) {
            return "Registrado";
        }
        return "Error";
    }

    /**
     * Metodo Consultar
     *
     * @return registros: retorna un LinkedList con los registros guardados en
     * la base de datos.
     */
    public LinkedList consultar() {
        try {
            java.sql.ResultSet rs;
            String sql = "select * from registros;";
            rs = conn.consultar(sql);
            while (rs.next()) {
                registros.add(new Registro(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registros;
    }

}
