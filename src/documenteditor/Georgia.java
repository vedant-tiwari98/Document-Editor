
package documenteditor;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;


public class Georgia implements Strategy {
    public Font f;
    @Override
    public void doOperation(JTextArea s) {
        f=s.getFont();
        int size=f.getSize();
        f=new Font("Georgia",size,size);
        s.setFont(f);
    }
}
