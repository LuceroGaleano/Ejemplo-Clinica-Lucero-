
package Class;

import java.time.LocalDate;

public class ClinicalRecord {
    protected LocalDate date;
    protected User doctor;
    protected String motive;
    protected String synthoms;
    protected String diagnosis;

    public ClinicalRecord(LocalDate date, User doctor, String motive, String synthoms, String diagnosis) {
        this.date = date;
        this.doctor = doctor;
        this.motive = motive;
        this.synthoms = synthoms;
        this.diagnosis = diagnosis;
    }
    
    
}
