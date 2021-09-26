/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import exception.*;
import holamundomvc.controller.ConnectionOpenClose;
import holamundomvc.controller.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author aitor
 */
public class ModelBD implements Model{
        
    private ConnectionOpenClose connection = new ConnectionOpenClose();
    private Connection con;
    private PreparedStatement sentencia;
    private String saludo="SELECT * FROM greetings";
    
    @Override
    public String getGreeting() throws ConnectException,ReadException {
        String greeting=null;
       ResultSet rs=null;
        try {
           con= connection.openConnection();
        } catch (ConnectException ex) {
            throw new ConnectException(ex.getMessage());
        }
           
        try {
            
            sentencia= con.prepareStatement(saludo);
           
             rs = sentencia.executeQuery();
            
            while(rs.next()){
                greeting = rs.getString("greeting");
            }
        } catch (Exception ex) {
            throw new ReadException("No se ha podido recoger la informacion");
        }
        try {
            connection.closeConnection(sentencia, con);
        } catch (ConnectException ex) {
            throw new ConnectException(ex.getMessage());
        }
        if(rs != null){
            try {
                rs.close();
            } catch (Exception ex) {
                throw new ReadException("No se ha podido cerrar la conexion");
            }
        }
        
        return greeting;
    }
    
}
