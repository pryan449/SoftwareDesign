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

    private ArrayList<Icon> icons;
    private ArrayList<Integer> Xlist;
    private ArrayList<Integer> Ylist;
  
    
    
    public void addIcon(Icon icon, int x, int y){
        icons.add(icon);
        Xlist.add(x);
        Ylist.add(y);
    }
    
    public CompositeIcon(){
    	icons = new ArrayList<Icon>();
    	Xlist = new ArrayList<Integer>();
    	Ylist = new ArrayList<Integer>();
    }
    
    public ArrayList getList(){
    	return icons;
    }
   
    
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        for(int i = 0; i < icons.size(); i++){
            icons.get(i).paintIcon(c, g, Xlist.get(i), Ylist.get(i));
        }
    }

    @Override
    public int getIconWidth() {
        return 25;
    }

    @Override
    public int getIconHeight() {
        return 25;
    }
    
}