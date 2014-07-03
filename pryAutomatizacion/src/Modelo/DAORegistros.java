/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controlador.ControlBD;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class DAORegistros {
    
    ControlBD conn= new ControlBD();
    LinkedList<Registro> registros= new LinkedList<Registro>();
    
    public String insertar(String temperatura, String nivel, String caudal_q1, String caudal_q2){
        
            String sql="INSERT INTO registros (temperatura, nivel, caudal_q1, caudal_q2, fecha) VALUES ('"+temperatura+"','"+nivel+"','"+caudal_q1+"','"+caudal_q2 +"',localtimestamp);";
            if (conn.actualizar(sql)==1){
                return "Registrado";
            }
            return "Error";
        }
     
    public LinkedList consultar() {
        StringBuffer sb = new StringBuffer();
        try {
            java.sql.ResultSet rs = null;
            String sql = "select * from registros;";
            rs = conn.consultar(sql);
            while (rs.next()) {
                registros.add(new Registro(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
//        
        return registros;
    }
    
}
