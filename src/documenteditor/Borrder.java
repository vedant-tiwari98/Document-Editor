package documenteditor;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

interface Borrder extends Decorator
{
   JTextArea addBorder (JTextArea j);
}