/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaredesign;

import java.awt.Frame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pat
 */
public class Gewy extends JPanel {

    Frame frame = new Frame();
    Panel panel = new Panel();
    CompositeIcon icons;

    public Gewy(CompositeIcon icons) {
        super();
        frame.setSize(800, 800);
        this.icons = icons;
        frame.add(new JLabel(icons));
        frame.setVisible(true);

    }



}
