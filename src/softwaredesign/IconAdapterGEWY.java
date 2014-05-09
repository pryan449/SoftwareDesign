/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesign;

import javax.swing.Icon;
import javax.swing.*;

/**
 *
 * @author pat
 */
public class IconAdapterGEWY {

    public static void main(String[] args) {
        Icon icon = new CC2("image.jpg");
        JComponent component = new IconAdapter(icon);
        JFrame f = new JFrame();
        JPanel pain = new JPanel();
        pain.add(component);
        f.add(component);
        f.setSize(component.getPreferredSize());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
