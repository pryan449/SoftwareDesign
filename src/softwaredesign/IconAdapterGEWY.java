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

    Icon icon = new CarIcon(100);
    JComponent component = new IconAdapter(icon) {
    };
}
