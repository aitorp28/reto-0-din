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
    
   
    @Test
    @Ignore
    public void testGetGreeting() {
        //Create object for testing
        
        //Call getGreeting method
        
        //Assert that greeting is what is supposed to be.
    }
     @Test
    public void testSameOrEquals() {
       Long long1=new Long(99l);
       Long long2= new Long(99l);
       
       
       //long1=long2;
       
       assertEquals(" The two objects are not equal", long1,long2);
       assertSame(" The two objects are not same",long1,long2);
    }
    
}
