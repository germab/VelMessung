
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
    private static String[] COLNAMES = {"Datum","Uhrzeit","Kennzeichen","Gemessen","Erlaubt","Übertretung"};
    
    @Override
    public int getRowCount() {
        return messungen.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int i) {
        return COLNAMES[i];
    }

    
    
    @Override
    public Object getValueAt(int i, int i1) {
        
        Measurement m = messungen.get(i);
        
        switch (i1) {
            case 0: return m.getDate();
            case 1: return m.getTime();
            case 2: return m.getKennzeichen();
            case 3: return m.getV_gemessen();
            case 4: return m.getV_erlaubt();
            case 5: return m.getV_gemessen()-m.getV_erlaubt();
            default: return "???";
        }
    }
    
    public void add(Measurement m){
        messungen. add(m);
        fireTableRowsInserted(messungen.size()-1, messungen.size()-1);
    }
    
    public void delete(int... idx){
        for(int i=idx.length-1;i>=0;i--){
            messungen.remove(i);
        }
        fireTableDataChanged();
    }
    
}
