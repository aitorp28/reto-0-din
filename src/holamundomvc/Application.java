/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc;

import holamundomvc.controller.Controller;
import holamundomvc.controller.Model;
import holamundomvc.controller.View;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

/**
 *
 * @author aitor
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factory modelFactory = new Factory();
        Factory viewFactory = new Factory();
        Model model = new modelFactory.getModel();
        View view = new View();
        Controller controller = new Controller();
        controller.run();
    }
    
}
