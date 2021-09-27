/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import holamundomvc.controller.Model;
import java.util.ResourceBundle;


/**
 * Esta clase se implementa de Model y contiene los metodos de para recoger 
 * el texto desde un archivo.
 * @author aitor
 */
public class ModelFile implements Model{
 
    /**
     * Este metodo recoge un String de un archivo.
     * @return devuelve el String al Controller.
     */
  
    @Override
    public String getGreeting() {
         String greeting = ResourceBundle.getBundle("holamundomvc.properties.text").getString("saludo");
        
        return greeting;
        
    }
    
}
