package documenteditor;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class RedBorder implements Borrder{
    public JTextArea specialpanel;
    public RedBorder(JTextArea specialpanel) {
        this.specialpanel=specialpanel;
    }
    
    @Override
    public JTextArea makePanel(){
         
        specialpanel=addBorder(specialpanel); 
        return specialpanel;  
    }
    @Override
    public JTextArea addBorder (JTextArea j){
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        j.setBorder(border);
        return j;
    } 
}
