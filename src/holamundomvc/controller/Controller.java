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
         * Este metodo se encarga de lanzar el saludo recibiendo el Model y la
         * View enviadas desde las Factory de Model y View.
         * @param model
         * @param view
         * @throws ConnectException
         * @throws ReadException 
         */
    public void run(Model model,View view) throws ConnectException, ReadException{
        
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
}
