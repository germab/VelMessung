
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel label = new JLabel();
        label.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);
        label.setOpaque(true);
        label.setBackground(Color.white);
        if(bln){
            label.setBackground(new Color(130, 200, 240, 123));
        }
        if(i1==5){
            label.setText(o.toString());
            if((int) o<=0){
                label.setText("Keine Übertretung");
            }
            else if((int) o<10){
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
        else if(i1==3||i1==4){
            label.setText(o.toString()+" km/h");
        }
        else if(i1==2){
            label.setText(o.toString());
        }
        else if(i1==1){
            LocalTime time = (LocalTime) o;
            label.setText(time.format(dtf1));
        }
        else{
            LocalDate date = (LocalDate) o;
            label.setText(date.format(dtf));
        }
        return label;
    }
    
}
