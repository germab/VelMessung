
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class VelocityTableModel extends AbstractTableModel{

    private ArrayList<Measurement> messungen = new ArrayList();
    
    @Override
    public int getRowCount() {
        return messungen.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Measurement m = messungen.get(i);
        return m;
    }
    
    public void add(Measurement m){
        messungen. add(m);
        fireTableRowsInserted(messungen.size()-1, messungen.size()-1);
    }
    
}
