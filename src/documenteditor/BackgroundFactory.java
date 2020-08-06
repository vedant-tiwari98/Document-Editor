
package documenteditor;

import javax.swing.JTextArea;

public class BackgroundFactory 
{
     public Background getBackground(String b,JTextArea t)
    {
        if(b.equals("Black"))
            return new BlackBackground(t);
        else if(b.equals("Orange"))
            return new OrangeBackground(t);
        else
            return null;
    }
    
}
