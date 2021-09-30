/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import holamundomvc.controller.View;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.*;
import javafx.scene.text.Font;


/**
 * Esta clase es implementada desde la interfaz de View.
 * @author aitor perez
 */
public class ViewJavaFX extends Application implements View{
    
    /**
     * 
     * @param greeting String enviado desde la clase controlador
     */
    @Override
    public void showGreeting(String greeting) {
        String[] parameters= new String [1];
        parameters[0] = greeting;
        launch(parameters);
    }
    /**
     * Lanza la ventana. 
     * @param primaryStage Es la plantilla donde se genera la ventana
     */
    public void start(Stage primaryStage) {
        Label text = new Label(getParameters().getUnnamed().get(0));
        text.setFont(new Font(40));
        Scene scene = new Scene(new Group(text));
        primaryStage.setTitle(getParameters().getUnnamed().get(0));
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
        
        
        
    
    }

  

 
    
}
