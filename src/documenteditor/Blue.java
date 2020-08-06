/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documenteditor;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

public class Blue implements Strategy{

    @Override
    public void doOperation(JTextArea s) {
    s.setForeground(Color.BLUE);
    }
    
}
    