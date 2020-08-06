
package documenteditor;

import java.awt.Color;
import javax.swing.JTextArea;

public class Yellow implements Strategy{

    @Override
    public void doOperation(JTextArea s) {
     s.setForeground(Color.yellow);
    }
   
}