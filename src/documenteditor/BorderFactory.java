
package documenteditor;

import javax.swing.JTextArea;
import javax.swing.border.Border;


public class BorderFactory {
    
    public Borrder getBorder(String b,JTextArea t)
    {
        if(b.equals("Red")){
            return new RedBorder(t);
        }
        else if(b.equals("Magenta"))
            return new MagentaBorder(t);
        else if(b.equals("Cyan"))
            return new CyanBorder(t);
        else
            return null;
    }
    
}
