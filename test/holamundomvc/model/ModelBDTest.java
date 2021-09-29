/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import exception.ConnectException;
import exception.ReadException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aitor
 */
public class ModelBDTest {
   private ModelBD baseData = new ModelBD();
    public ModelBDTest() {
    }
    @Test
    public void testGetGreeting() throws ConnectException, ReadException {
        //Create object for testing
        
        //Call getGreeting method
        String greeting= "Hola Mundo";
        String testGreeting = baseData.getGreeting();
        
        assertEquals("Error al cargar saludo desde la base de datos",greeting,testGreeting);
    }
}

