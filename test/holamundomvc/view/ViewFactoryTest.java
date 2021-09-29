/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import holamundomvc.controller.View;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aitor
 */
public class ViewFactoryTest {
    private ViewFactory vista = new ViewFactory();
    
    public ViewFactoryTest() {
    }
    
    @Test
    public void testGetView() {
             
        View view = vista.getView();
        assertNotNull("Error no devuelve vista",view);
      
    }
}
