/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import sun.util.calendar.CalendarSystem;

/**
 *
 * @author aitor
 */
public class Controller {
    
        Model model = null ;
        View view = null;
        
    public void run(){
        
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
}
