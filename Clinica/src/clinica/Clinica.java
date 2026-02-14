
package clinica;

import Class.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Clinica {

    public static void main(String[] args) {
        User doctor = new User("JulianDoc", "Jul10", Role.Doctor, "Julian", "7158964785", LocalDate.of(1995, 10, 25), "Cra 34c # 89B", "301719347", "Julian@gmail.com");
        
        Company company1 = new Company("Live");
        Policy policy1 = new Policy(company1, "Pol1", true, LocalDate.of(2026, 3, 13));
        Contact contact1 = new Contact("Mother", "Maria", "5247847985", LocalDate.of(1980, 2, 10), "Cra 62", "147895469", "Maria@gmail.com");
        
        Patient patient1 = new Patient(Gender.Famale, contact1, policy1, "Lucia", "4778459560", LocalDate.of(2001, 5, 2), "Cra 62", "4785476914", "Lucia@gmail.com");

        Item item1 = new Item("item1", "acetaminophen", 10000, ItemType.Medication);
        MedicalOrder medical1 = new MedicalOrder("Two each day", "One Mont", "Order1", item1);
        
        Item item2 = new Item("item2", "Rehabilitation", 500000, ItemType.Procedure);
        Specialist specialist1 = new Specialist("spe1", "Physiotherapist");
        ProcOrder proc1 = new ProcOrder("3", "1 per month", true, specialist1, "procOrder1", item2);
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(medical1);
        orderItems.add(proc1);
        
        Order orderPatient1 = new Order("Order1", patient1, doctor, LocalDate.now(), orderItems);
        System.out.println(orderPatient1.getInfo()); 
    }
}
