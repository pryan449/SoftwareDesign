/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaredesign;

import java.awt.Frame;
import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pat
 */
public class CompositeGewy extends JPanel {

    Frame frame = new Frame();
    Panel panel = new Panel();
    CompositeIcon icon = new CompositeIcon();

    public CompositeGewy(CompositeIcon icon) {
        super();
        frame.setSize(800, 800);
        this.icon = icon;
        icon.addIcon(new CC1("DAN.jpg"), 10, 10);
        icon.addIcon(new CC2("1396752876253.jpg"), 10, 10);
        frame.add(new JLabel(icon));
        frame.setVisible(true);

    }
    public static void main(String[] args){
       
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
        Icon icon = new CC2("DAN.jpg");
      
        JFrame f = new JFrame();
        JPanel pain = new JPanel();
        
       setIcon(CompositeIcon);
      // frame.setVisible(true);
      // CompositeIcon icons = new CompositeIcon();
      // icons.addIcon(new CC1("1396752876253.jpg"), 10, 10);
      // icons.addIcon(new CC2("DAN.jpg"), 100, 100);
      // CompositeGewy gui = new CompositeGewy(icons);
   }
   
}
        
        
    

 
