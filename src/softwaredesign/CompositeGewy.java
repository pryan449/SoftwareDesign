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
    private CompositeIcon List;

    public CompositeGewy(CompositeIcon icons) {
        super();
        frame.setSize(1000, 1000);
        setSize(750, 750);
        List = icons;
        panel.add(new JLabel(List));
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        CompositeIcon icons = new CompositeIcon();
        icons.addIcon(new CC1("1396752876253.jpg"), 0, 375);
        icons.addIcon(new CC2("1398526266597.jpg"), 5, 50);
        CompositeGewy gui = new CompositeGewy(icons);
    }
}
