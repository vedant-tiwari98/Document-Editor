/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documenteditor;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

class Scroll implements Decorator{
  public JTextArea specialpanel;
    public Scroll(JTextArea specialpanel) {
        this.specialpanel=specialpanel;
    }
    @Override
    public JTextArea makePanel(){
       specialpanel=addScrollPane(specialpanel); 
    return specialpanel;    
       
    }
    private JTextArea addScrollPane (JTextArea j){
       JScrollPane s=new JScrollPane(j, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );
       s.setPreferredSize(new Dimension(600,600)); 
    return j;  
 } 
}
