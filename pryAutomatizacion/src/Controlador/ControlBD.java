/*
 * Clase ControlBD. Encargada de realizar las conecciones con la base de datos.
 */
package Controlador;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Dahiana Andrea Barreto
 * @author David Asaaf Vergara Almanza
 * @author Felipe Erazo Guerrero
 */
public final class ControlBD implements Serializable {

    ResultSet res = null;
    private Connection con = null;
    Statement st = null;
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://127.0.0.1:5432/bd_automatizacion";
    String userDB = "postgres";
    String passDB = "admin";

    public ControlBD() {
        conectar();
    }

    /**
     * Metodo Conectar. Crea la conexión a la base de datos
     *
     * @return valor de la excepción en caso de que exista tal excepción.
     */
    private int conectar() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargal el driver :-( " + driver);
            return -1;

        }
        try {
            setCon(DriverManager.getConnection(url, userDB, passDB));
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la conexion :-(");
            return -2;
        }
        return 1;
    }
    
    public void cerrarConexion() throws SQLException{
        con.close();
    }

    /**
     * Metodo Insertar: inserta en la base de datos.
     *
     * @param sql. Consulta que se realiza en la base de datos
     * @return valor de la excepción en caso de que exista tal excepción.
     */
    private SQLException insertar(String sql) {//------------------------------------->SIN USO
        try {
            st = getCon().createStatement();
            st.execute(sql);
            st.close();
            return null;
        } catch (SQLException e) {
            return e;
        }
    }

    /**
     * Metodo Consultar. Ejecuta una consulta sql en la base de datos
     *
     * @param sql. Consulta
     * @return. El resultado de la consulta
     */
    public ResultSet consultar(String sql) {
        try {
            st = getCon().createStatement();
            res = st.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
        return res;
    }

    /**
     * Metodo Verificar:
     *
     * @param sql
     * @return
     */
    private int verificar(String sql) {//--------------------------------------->SIN USO
        try {
            st = getCon().createStatement();
            res = st.executeQuery(sql);
            if (res.next()) {
                return 1;
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1;
    }

    /**
     * Metodo getCon: Obtiene la conexión.
     *
     * @return la conexión
     */
    public Connection getCon() {
        return con;
    }

    /**
     * Metodo setCon: Modifica la conexión.
     *
     * @param con el valor de la conexión que será modificado
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * Metodo actualizar
     *
     * @param sql
     * @return
     */
    public int actualizar(String sql) {
        try {
            st = getCon().createStatement();
            st.executeUpdate(sql);
            st.close();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1;
    }
}
