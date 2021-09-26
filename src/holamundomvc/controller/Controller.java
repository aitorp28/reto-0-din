/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import exception.*;


/**
 * Este es el controlador de mi aplicacion
 * @author aitor
 */
public class Controller {
    
       
        /**
         *
         */
    public void run(Model model,View view) throws ConnectException, ReadException{
        
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
}
