/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documenteditor;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;

public class Monospaced implements Strategy {
    public Font f;
    @Override
    public void doOperation(JTextArea s) {
        f=s.getFont();
        int size=f.getSize();
        f=new Font("Monospaced",size,size);
        s.setFont(f);
    }
    
}
