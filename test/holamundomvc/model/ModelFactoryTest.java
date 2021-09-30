/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import holamundomvc.controller.Model;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Comprueba si al pedir modelo en realidad lo recibimos.
 * @author aitor perez
 */
public class ModelFactoryTest {
   private ModelFactory modelo = new ModelFactory();
    public ModelFactoryTest() {
    }
    @Test
    public void testGetModel() {
        
        Model model = modelo.getModel();
        assertNotNull("Error no devuelve modelo",model);
      
    }
}
