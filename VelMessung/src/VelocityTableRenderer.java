
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class VelocityTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel label = new JLabel();
        if(i1==5){
            label.setOpaque(true);
            label.setText(o.toString());
            if((int) o<10){
                label.setBackground(Color.BLUE);
            }
            else if((int) o<20){
                label.setBackground(Color.yellow);
            }
            else if((int) o<30){
                label.setBackground(Color.ORANGE);
            }
            else{
                label.setBackground(Color.red);
            }
        }
    }
    
}
