/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import exception.ConnectException;
import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aitor
 */
public class ConnectionOpenCloseTest {
    ConnectionOpenClose conexiones = new ConnectionOpenClose();
    public ConnectionOpenCloseTest() {
    }
    
    @Test
    public void testConnectionOpenClose() throws ConnectException{
        Connection con = null;
        con = conexiones.openConnection();
        assertNotNull("Error al abrir conexion con base de datos",con);
        
    }
}
