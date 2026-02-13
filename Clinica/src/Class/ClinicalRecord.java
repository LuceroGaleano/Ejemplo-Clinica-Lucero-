
package Class;

import java.util.Date;

public class ClinicalRecord {
    protected Date date;
    protected User doctor;
    protected String motive;
    protected String synthoms;
    protected String diagnosis;

    public ClinicalRecord(Date date, User doctor, String motive, String synthoms, String diagnosis) {
        this.date = date;
        this.doctor = doctor;
        this.motive = motive;
        this.synthoms = synthoms;
        this.diagnosis = diagnosis;
    }
    
    
}
