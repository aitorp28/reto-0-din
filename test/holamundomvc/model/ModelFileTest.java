/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author aitor
 */
public class ModelFileTest {
    
    private ModelFile file = new ModelFile();
  
     @Test
    public void testModelFile() {
       
    }
      @Test
    public void testGetGreeting() {
        //Create object for testing
        
        //Call getGreeting method
        String greeting= "Hola Mundo";
        String testGreeting = file.getGreeting();
        
        assertEquals("Error al cargar saludo desde el archivo",greeting,testGreeting);
    }
}
