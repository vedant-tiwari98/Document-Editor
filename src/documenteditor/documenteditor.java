package documenteditor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;


//public static 
public class documenteditor
{
    public static void main(String args[])
    {
        UserInterFace gui = new UserInterFace();
    }
}

class UserInterFace implements ActionListener{
    JFrame f;
    JTextArea text;
    JPanel upper,editable,fixed,menubar;
    JLabel l,photo;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi21,mi20,mi22;
    JButton image;
    Context context;
    Borrder b;
    BorderFactory bf=new BorderFactory();
    Background bg;BackgroundFactory bgf=new BackgroundFactory();
    UserInterFace()
    {
        f = new JFrame("DOCUMENT EDITOR");
        f.setLayout(new GridLayout(3,1));
        menubar=new JPanel(new BorderLayout());
        
        upper = new JPanel(new BorderLayout());
        image = new JButton();
        fixed = new JPanel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel("DESIGN PATTERN PROJECT");
        fixed.add(l);
        photo =new JLabel();
        photo.setSize(250,150);
        JLabel label=new JLabel("PHOTO WILL BE SHOWN HERE");
        photo.add(label);
        upper.add(fixed,BorderLayout.WEST);
        upper.add(photo,BorderLayout.EAST);
      
        editable = new JPanel(new GridLayout(1,1));
        text = new JTextArea();
        editable.add(text);
        JScrollPane p=new JScrollPane(text);
        JScrollBar b=new JScrollBar();
        p.add(b);
        editable.add(p);
        JMenuBar mb = new JMenuBar();
        menubar.setSize(15, 150);
 
        // Create amenu for menu 
        JMenu m1 = new JMenu("File"); 
  
        // Create menu items 
        mi1 = new JMenuItem("New"); 
        mi2 = new JMenuItem("Open"); 
        mi3 = new JMenuItem("Save"); 
//        mi4 = new JMenuItem("Print");
        
  
        // Add action listener 
        mi1.addActionListener(this); 
        mi2.addActionListener(this); 
        mi3.addActionListener(this); 
//        mi4.addActionListener(this);
  
        m1.add(mi1); 
        m1.add(mi2); 
        m1.add(mi3); 
//        m1.add(mi4);
        
  
        // Create amenu for menu 
        JMenu m2 = new JMenu("Edit"); 
        // Create menu items 
        mi4 = new JMenuItem("cut"); 
        mi5 = new JMenuItem("copy"); 
        mi6 = new JMenuItem("paste"); 
        mi20=new JMenuItem("Insert Image");
  
        // Add action listener 
        mi4.addActionListener(this); 
        mi5.addActionListener(this); 
        mi6.addActionListener(this);
        mi20.addActionListener(this);
  
        m2.add(mi4); 
        m2.add(mi5); 
        m2.add(mi6); 
        m2.add(mi20);
        
        JMenu m3=new JMenu("Text Style");
        
        mi7=new JMenuItem("San Serif");
        mi8=new JMenuItem("Georgia");
        mi9=new JMenuItem("Monospaced");
        
        mi7.addActionListener(this);
        mi8.addActionListener(this);
        mi9.addActionListener(this);
        
        m3.add(mi7);
        m3.add(mi8);
        m3.add(mi9);
  
        mb.add(m1); 
        mb.add(m2); 
        mb.add(m3);
        
        JMenu m4=new JMenu("Text Size");
        
        mi10=new JMenuItem("15");
        mi11=new JMenuItem("25");
        mi12=new JMenuItem("35");
        
        mi10.addActionListener(this);
        mi11.addActionListener(this);
        mi12.addActionListener(this);
        
        m4.add(mi10);
        m4.add(mi11);
        m4.add(mi12);
        
        JMenu m5=new JMenu("Text Color");
        
        mi13=new JMenuItem("Blue");
        mi14=new JMenuItem("Red");
        mi15=new JMenuItem("Yellow");
        
        mi13.addActionListener(this);
        mi14.addActionListener(this);
        mi15.addActionListener(this);
        
        m5.add(mi13);
        m5.add(mi14);
        m5.add(mi15);
        
        JMenu m6=new JMenu("Border");
        mi16=new JMenuItem("Red");
        mi17=new JMenuItem("Magenta");
        mi18=new JMenuItem("Cyan");
        
        JMenu m7=new JMenu("Background");
        mi19=new JMenuItem("Black");
        mi21=new JMenuItem("Orange");
        
        
        m6.add(mi16);
        m6.add(mi17);
        m6.add(mi18);
        m7.add(mi19);
        m7.add(mi21);
        mi16.addActionListener(this);
        mi17.addActionListener(this);
        mi18.addActionListener(this);
        mi19.addActionListener(this);
        mi21.addActionListener(this);
        
  
        mb.add(m1); 
        mb.add(m2); 
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        mb.add(m6);
        mb.add(m7);
        f.add(menubar,BorderLayout.PAGE_START);
        f.add(upper,BorderLayout.CENTER);
        f.add(editable,BorderLayout.PAGE_END);
 
        f.setJMenuBar(mb);
 
        f.show();     
        f.setSize(500,500);
        f.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==mi1){
            NewTextEditor e=new NewTextEditor(text);
            text=e.setText();
        }
        
        if(ae.getSource()==mi2)
        {
             OpenEditor o=new OpenEditor(text, f);
             text=o.setText();
        }
        
        if(ae.getSource()==mi3)
        {
             SaveFile s=new SaveFile(text, f);
             text=s.setText();
        }
        
        if(ae.getSource()==mi7){
            context=new Context(new SanSerif());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi8){
            context=new Context(new Georgia());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi9){
            context=new Context(new Monospaced());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi10){
            context=new Context(new Size15());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi11){
            context=new Context(new Size25());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi12){
            context=new Context(new Size35());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi13){
            context=new Context(new Blue());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi14){
            context=new Context(new Red());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi15){
            context=new Context(new Yellow());
            context.executeStrategy(text);
        }
        
        if(ae.getSource()==mi16){
            b=bf.getBorder("Red", text);
            text=b.makePanel();
        }
        if(ae.getSource()==mi17){
            b=bf.getBorder("Magenta", text);
            text=b.makePanel();
        }
        if(ae.getSource()==mi18){
             b=bf.getBorder("Cyan", text);
            text=b.makePanel();
        }
        if(ae.getSource()==mi19){
            bg=bgf.getBackground("Black", text);
            text=bg.makePanel();
        }
        if(ae.getSource()==mi21){
            bg=bgf.getBackground("Orange", text);
            text=bg.makePanel();
        }
        
        
        if(ae.getSource()==mi20){
            InsertImage image=new InsertImage(photo);
        }
       
    }
}