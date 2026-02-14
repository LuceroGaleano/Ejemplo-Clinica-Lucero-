package Class;


public class ClinicalVisit {
    protected Patient patient;
    protected VitalInfo vitalInfo;
    protected String observations;
    protected Order order;

    public ClinicalVisit(Patient patient, VitalInfo vitalInfo, String observations, Order order) {
        this.patient = patient;
        this.vitalInfo = vitalInfo;
        this.observations = observations;
        this.order = order;
    }
}
