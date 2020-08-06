
package documenteditor;

import java.awt.Color;
import javax.swing.JTextArea;

public class Red implements Strategy{

    @Override
    public void doOperation(JTextArea s) {
     s.setForeground(Color.red);
    }
}