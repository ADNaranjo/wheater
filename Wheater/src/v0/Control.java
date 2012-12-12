/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author utp
 */
public class Control implements ActionListener 

{
    public Control {
       Modelo = new Modelo();
    Vista = new Vista (Modelo,this);
    Vista.setVisible(true);

}
     public static void main(String[] args) {
    
 
     }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String comando = e.getActionCommand();
        if (comando.equals("Actualizar")){
        }
            
    }
    
}
