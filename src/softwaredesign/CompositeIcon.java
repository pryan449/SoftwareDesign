/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesign;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author pat
 */
import javax.swing.Icon;

public class CompositeIcon implements Icon {

    private ArrayList<Icon> iconList;
    private ArrayList<Integer> XList;
    private ArrayList<Integer> YList;

    public CompositeIcon() {
        iconList = new ArrayList<Icon>();
        XList = new ArrayList<Integer>();
        YList = new ArrayList<Integer>();
    }

    public int getIconHeight() {
        return 700;
    }

    public int getIconWidth() {
        return 700;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        for (int i = 0; i < iconList.size(); i++) {
            iconList.get(i).paintIcon(c, g, XList.get(i), YList.get(i));
        }

    }

    public void addIcon(Icon icon, int x, int y) {
        iconList.add(icon);
        XList.add(x);
        YList.add(y);
    }
}
