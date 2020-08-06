
package documenteditor;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 *
 * @author Kashmira
 */
public class OrangeBackground  implements Background{
  public JTextArea specialpanel;
    public OrangeBackground(JTextArea specialpanel) {
        this.specialpanel=specialpanel;
    }
    @Override
    public JTextArea makePanel(){
         
       specialpanel=addBackground(specialpanel); 
    return specialpanel;  
    }
  

    @Override
    public JTextArea addBackground(JTextArea j) {
         j.setBackground(Color.ORANGE);
 return j; 
    }
}