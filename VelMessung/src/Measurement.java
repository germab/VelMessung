
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class Measurement implements Serializable{
    
    private LocalDate date;
    private LocalTime time;
    private String kennzeichen;
    private int v_gemessen;
    private int v_erlaubt;
    private int uebertretung;

    public Measurement(LocalDate date, LocalTime time, String kennzeichen, int v_gemessen, int v_erlaubt) {
        this.date = date;
        this.time = time;
        this.kennzeichen = kennzeichen;
        this.v_gemessen = v_gemessen;
        this.v_erlaubt = v_erlaubt;
        this.uebertretung = ((v_gemessen-v_erlaubt>0) ? (v_gemessen-v_erlaubt) : 0);
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getV_gemessen() {
        return v_gemessen;
    }

    public int getV_erlaubt() {
        return v_erlaubt;
    }

    public int getUebertretung() {
        return uebertretung;
    }
    
    
    
}
