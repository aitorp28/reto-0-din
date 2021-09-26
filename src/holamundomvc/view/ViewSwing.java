/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

import holamundomvc.controller.View;
import javax.swing.JOptionPane;

/**
 *
 * @author aitor
 */
public class ViewSwing implements View{
    
    

    @Override
    public void showGreeting(String greeting) {
        JOptionPane.showMessageDialog(null, greeting);
    }
}
