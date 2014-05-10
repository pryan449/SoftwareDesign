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
       JFrame frame = new JFrame();
       frame.setSize(600, 600);
       JComponent a = new IconAdapter(new CC1("1396752876253.jpg"));
       frame.add(a);
       frame.setVisible(true);
    }

}
