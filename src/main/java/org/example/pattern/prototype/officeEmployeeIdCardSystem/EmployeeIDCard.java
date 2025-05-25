package org.example.pattern.prototype.officeEmployeeIdCardSystem;

public class EmployeeIDCard implements Prototype<EmployeeIDCard>{

    private String companyName;
    private String department;
    private String issuedBy;
    private String employeeName;
    private String employeeId;

    public EmployeeIDCard(String companyName, String department, String issuedBy) {
        this.companyName = companyName;
        this.department = department;
        this.issuedBy = issuedBy;
    }

    // Set unique employee details
    public void setEmployeeDetails(String employeeName, String employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    @Override
    public EmployeeIDCard clone() {
        return new EmployeeIDCard(this.companyName, this.department, this.issuedBy);
    }

    @Override
    public String toString() {
        return "EmployeeIDCard{" +
                "companyName='" + companyName + '\'' +
                ", department='" + department + '\'' +
                ", issuedBy='" + issuedBy + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
