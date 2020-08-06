
package documenteditor;

import java.awt.TextArea;
import javax.swing.JTextArea;


public class NewTextEditor {
    
        JTextArea t;
        public NewTextEditor(JTextArea text)
        {
                text.setText("");
                t=text;
                
        }  
        public JTextArea setText()
        {
            return  t;
        }
        
}
