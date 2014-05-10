/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaredesign;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pat
 */
public class CTest {
    public static void main(String[] args){
        CompositeGewy gui = new CompositeGewy();
        gui.setVisible(true);
        JFrame f = new JFrame();
        JPanel pain = new JPanel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
