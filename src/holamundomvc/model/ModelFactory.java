/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

import holamundomvc.controller.Model;
import java.util.ResourceBundle;

/**
 * Esta es la factoria del modelo se encarga de mandar el 
 * @author aitor
 */
public class ModelFactory {
    
    private String type = ResourceBundle.getBundle("holamundomvc.properties.model").getString("modelo");
        final private String BD = "ModelBD";
        final private String File = "ModelFile";
    
    public Model getModel(){
        Model model = null;
        switch (type){
            case BD: {
                model = new ModelBD(); 
            }
            break;
            case File:{
                model = new ModelFile(); 
            }
            break;
        }
        return model;
    }
    
}
