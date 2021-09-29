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
         * @param model Recibe un modelo
         * @param view Recibe una vista
         * @throws ConnectException Error de conexion con base de datos
         * @throws ReadException Error de lectura con base de datos
         */
    public void run(Model model,View view) throws ConnectException, ReadException{
        
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
}
