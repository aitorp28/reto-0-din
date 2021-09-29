/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import holamundomvc.controller.View;

/**
 *
 * @author aitor
 */
public class ViewText implements View{
    
    /**
     * 
     * @param greeting String enviado desde la clase controlador
     * @author aitor
     */
    @Override
    public void showGreeting(String greeting) {
            System.out.println(greeting);
        }
    
}
