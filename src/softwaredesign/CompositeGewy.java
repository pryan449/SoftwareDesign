/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaredesign;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pat
 */
public class CompositeGewy extends JPanel {

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private CompositeIcon ciList;
    
    public CompositeGewy(CompositeIcon icons)
    {
        super();
        frame.setSize(600,600);
        setSize(600, 600);
        ciList = icons;
        panel.add(new JLabel(ciList));
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) throws Exception
    {
        CompositeIcon icons = new CompositeIcon();
        icons.addIcon(new CC1("1396752876253.jpg"), 100, 170);
        icons.addIcon(new CC2("1396978076204.jpg"), 200, 100);
        CompositeGewy gui = new CompositeGewy(icons);
    }
  }

