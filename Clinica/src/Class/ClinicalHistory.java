
package Class;

import java.util.ArrayList;

public class ClinicalHistory {
    protected String id;
    protected ArrayList<ClinicalRecord> clinicaRecord;

    public ClinicalHistory(String id, ClinicalRecord clinicaRecord) {
        this.id = id;
        this.clinicaRecord.add(clinicaRecord);
    }
}
