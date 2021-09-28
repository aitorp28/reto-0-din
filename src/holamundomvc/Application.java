/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc;

import exception.*;
import holamundomvc.controller.Controller;
import holamundomvc.controller.Model;
import holamundomvc.controller.View;
import holamundomvc.model.ModelFactory;
import holamundomvc.view.ViewFactory;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

/**
 *
 * @author aitor
 */
public class Application {

    /**
     * @param args the command line arguments
     * @throws exception.ConnectException Excepcion para errores en conexion
     * @throws exception.ReadException Excepcion para errores en lectura
     */
    public static void main(String[] args) throws ConnectException, ReadException  {
        // TODO code application logic here
        ModelFactory modelFactory = new ModelFactory();
        ViewFactory viewFactory = new ViewFactory();
        Model model =  modelFactory.getModel();
        View view = viewFactory.getView();
        Controller controller = new Controller();
        controller.run(model,view);
    }
    
}
