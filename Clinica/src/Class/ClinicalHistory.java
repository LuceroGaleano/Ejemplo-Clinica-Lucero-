
package Class;

import java.util.ArrayList;

public class ClinicalHistory {
    protected String id;
    protected ArrayList<ClinicalRecord> clinicaRecord;

    public ClinicalHistory(String id, ArrayList<ClinicalRecord> clinicaRecord) {
        this.id = id;
        this.clinicaRecord = clinicaRecord;
    }
}
