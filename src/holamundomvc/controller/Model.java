/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import exception.*;


/**
 *  Esta es la interfaz contiene las funciones que se implementan al modelo
 * @author aitor
 */
public interface Model {

    /**
     *
     * @return
     * @throws exception.ConnectException
     */
   public String  getGreeting() throws ConnectException,ReadException;
}
