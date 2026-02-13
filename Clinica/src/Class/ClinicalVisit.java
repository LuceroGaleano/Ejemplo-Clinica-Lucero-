package Class;


public class ClinicalVisit {
    protected Patient patient;
    protected VitalInfo vitalInfo;
    protected String observations;
    protected Order order;
    protected Item item;

    public ClinicalVisit(Patient patient, VitalInfo vitalInfo, String observations, Order order, Item item) {
        this.patient = patient;
        this.vitalInfo = vitalInfo;
        this.observations = observations;
        this.order = order;
        this.item = item;
    }
}
