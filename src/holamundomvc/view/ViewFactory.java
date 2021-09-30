/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import holamundomvc.controller.View;
import java.util.ResourceBundle;

/**
 * Esta es la factoria de la vista se encarga de mandar el modelo seleccionado
 * en el archivo de configuracion.
 * Esta clase es llamada por la aplicacion.
 * @author aitor perez
 */
public class ViewFactory {
    
        /**
         * 
         * Recoge el texto del archivo de seleccion de vista.
         */
       private String type = ResourceBundle.getBundle("holamundomvc.properties.view").getString("vista");
        final private String TEXT = "Text";
        final private String SWING = "Swing";
        final private String JAVAFX = "JavaFX";
    
      /**
       * Decide que vista utilizar dependiendo de lo que obtenga de la configuracion.
       * @return La implementacion de View seleccionada
       */
    public View getView(){
        View view = null;
        switch (type){
            case TEXT: {
                view = new ViewText(); 
            }
            break;
            case SWING:{
                view = new ViewSwing(); 
            }
            break;
             case JAVAFX:{
                view = new ViewJavaFX(); 
            }
            break;
        }
        
        
        
        return view;
    }
    
}
