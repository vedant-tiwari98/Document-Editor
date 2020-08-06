
package documenteditor;

import java.awt.Font;
import static java.awt.SystemColor.text;
import javax.swing.JTextArea;

public class Size25 implements Strategy{

    @Override
    public void doOperation(JTextArea s) {
        Font f=s.getFont();
//        String fontName=f.getText();
//String fontFamily=f.getFont().toString();
float fontSize=f.getSize();
//int fontStyle=f.getSt();

//f=new Font(fontName,fontStyle,14);
s.setFont(f.deriveFont(25.0f));
    }
}