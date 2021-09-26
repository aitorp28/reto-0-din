/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import holamundomvc.controller.View;
import java.util.ResourceBundle;

/**
 *
 * @author aitor
 */
public class ViewFactory {
    
    
       private String type = ResourceBundle.getBundle("holamundomvc.properties.view").getString("vista");
        final private String TEXT = "Text";
        final private String SWING = "Swing";
        final private String JAVAFX = "JavaFX";
    
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
