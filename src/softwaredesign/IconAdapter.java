package softwaredesign;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pat
 */
public abstract class IconAdapter extends JComponent {
    
    private Icon icon;

    public IconAdapter(Icon i) {
        icon = i;
    }

    public void paintComponent(Graphics g) {
        icon.paintIcon(this, g, 0, 0);
    }

    public Dimension getPreferredSize() {
        return new Dimension(icon.getIconWidth(),
                icon.getIconHeight());
    }
}

