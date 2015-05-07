import java.awt.Color;
import java.awt.Component;

import javax.swing.table.TableCellRenderer;

public class CustomRenderer 
{

    public Component prepareRenderer(TableCellRenderer r, int data, int columns){
        Component c = GUI.tableBest.prepareRenderer(r, data, columns);
                               
        if (data % 2 == 0) //alternating colours among rows
                c.setBackground(Color.WHITE);
                               
        else c.setBackground(Color.LIGHT_GRAY);
                               
                return c;
        }
}