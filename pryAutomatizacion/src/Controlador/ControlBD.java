/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Felipe
 */
public class ControlBD implements Serializable{

    ResultSet res = null;
    private Connection con = null;
    Statement st = null;
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://127.0.0.1:5433/bd_automatizacion";
    String userDB = "postgres";
    String passDB = "admin";

    public ControlBD() {
        conectar();
    }

    public int conectar() {
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
    
    public SQLException insertar(String sql) {
        try {
            st = getCon().createStatement();
            st.execute(sql);
            st.close();
            return null;
        } catch (SQLException e) {
            return e;
        }
    }

    public ResultSet consultar(String sql){
         try{
            st=getCon().createStatement();
            res= st.executeQuery(sql);
         }
        catch(SQLException e){
            return null;
        }
         return res;
     }
    
    
    public int verificar(String sql){
        try{
            st=getCon().createStatement();
            res= st.executeQuery(sql);
            if (res.next())
                return 1;
            st.close();
             }
        catch(SQLException e){
            System.out.println(e);
        }
        return -1;
    }
    
    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }
    
     
    public int actualizar(String sql){
        try{
            st=getCon().createStatement();
            st.executeUpdate(sql);
            st.close();
            return 1;
         }
        catch(SQLException e){
            System.out.println(e);
        }
        return -1;
    }
}
