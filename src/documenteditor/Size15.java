
package documenteditor;

import java.awt.Font;
import javax.swing.JTextArea;

public class Size15 implements Strategy{

    @Override
    public void doOperation(JTextArea s) {
        Font f=s.getFont();
//        String fontName=f.getText();
//String fontFamily=f.getFont().toString();
    float fontSize=f.getSize();
//int fontStyle=f.getSt();

//f=new Font(fontName,fontStyle,14);
    s.setFont(f.deriveFont(15.0f));
    }
 
    
}

