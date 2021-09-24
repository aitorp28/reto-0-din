/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import holamundomvc.controller.Model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aitor
 */
public class ModelFile implements Model{

        Properties properties = new Properties();
        
    /**
     *
     * @return
     */
    @Override
    public String getGreeting() {
        try {
            properties.load(new FileReader("text.properties"));
        } catch (IOException ex) {
            Logger.getLogger(ModelFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return properties.getProperty("Saludo");
        
    }
    
}
