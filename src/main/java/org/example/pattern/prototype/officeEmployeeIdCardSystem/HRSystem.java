package org.example.pattern.prototype.officeEmployeeIdCardSystem;

public class HRSystem {
    public static void main(String[] args) {
        //Setup prototypes
        IDCardRegistry registry = new IDCardRegistry();
        registry.registerPrototype("TechCorp_Engineering", new EmployeeIDCard("TechCorp", "Engineering", "HR"));
        registry.registerPrototype("TechCorp_HR", new EmployeeIDCard("TechCorp", "HR", "HR"));

        //Create employee ID cards
        EmployeeIDCard card1 = registry.getCloneCard("TechCorp_Engineering");
        card1.setEmployeeDetails("Alice Smith", "E12345");
        System.out.println(card1);

        EmployeeIDCard card2 = registry.getCloneCard("TechCorp_HR");
        card2.setEmployeeDetails("Bob Johnson", "E67890");
        System.out.println(card2);
    }
}
