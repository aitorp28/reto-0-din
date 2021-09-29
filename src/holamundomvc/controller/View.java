/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

/**
 * Esta interfaz contiene las funciones que se implementan a la vista.
 * @author aitor
 */
public interface View {
    
    /**
     * 
     * @param greeting Muestra un saludo en funcion de un String recibido.
     */
    public  void showGreeting(String greeting);
}
