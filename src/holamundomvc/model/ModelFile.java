/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import holamundomvc.controller.Model;
import java.util.ResourceBundle;


/**
 * Esta clase se 
 * @author aitor
 */
public class ModelFile implements Model{

        
        
    /**
     *
     * @return
     */
  
    @Override
    public String getGreeting() {
         String greeting = ResourceBundle.getBundle("holamundomvc.properties.text").getString("saludo");
        
        return greeting;
        
    }
    
}
