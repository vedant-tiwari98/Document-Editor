package documenteditor;

import java.awt.Color;
import javax.swing.JTextArea;

class BlackBackground implements Background{
  public JTextArea specialpanel;
    public BlackBackground(JTextArea specialpanel) {
        this.specialpanel=specialpanel;
    }
    @Override
    public JTextArea makePanel(){
         
       specialpanel=addBackground(specialpanel); 
        return specialpanel;  
    }
  

    @Override
    public JTextArea addBackground(JTextArea j) {
         j.setBackground(Color.BLACK);
     return j; 
    }
}