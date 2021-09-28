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
     * Metodo del modelo para obtencion del greeting
     * @return devuelve un String al controlador
     * @throws exception.ConnectException Excepcion para errores en conexion
     * @throws exception.ReadException Excepcion para errores en lectura
     */
   public String getGreeting() throws ConnectException,ReadException;
}
