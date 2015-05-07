import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomRenderer extends DefaultTableCellRenderer 
{
private static final long serialVersionUID = 6703872492730589499L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        int tVal= (int) table.getValueAt(row, 0);
        if(tVal%2== 0){
            cellComponent.setBackground(Color.LIGHT_GRAY);
        } else{
            cellComponent.setBackground(Color.WHITE);
        }
        return cellComponent;
    }
}