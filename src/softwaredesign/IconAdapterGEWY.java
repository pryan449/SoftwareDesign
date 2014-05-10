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
        JFrame f = new JFrame();
        f.setSize(600, 600);
        JComponent i = new IconAdapter(new CC1("1396752876253.jpg"));
        f.add(i);
        f.setVisible(true);
    }

}
